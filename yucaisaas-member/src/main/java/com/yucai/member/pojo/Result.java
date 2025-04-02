package com.yucai.member.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: Result
 * Package: com.yucai.member.pojo
 * Description:
 *
 * @Author liu
 * @Create 3/31/2025 7:52 PM
 * @Version 1.0
 */
public class Result<T> {

    //返回码
    protected Integer error;

    //返回消息
    protected String msg;

    //返回数据
    private T data;

    public Result(){}

    // 返回数据
    protected static <T> Result<T> build(T data) {
        Result<T> result = new Result<T>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> Result<T> build(T body, Integer error, String message) {
        Result<T> result = build(body);
        result.setError(error);
        result.setMsg(message);
        return result;
    }

    public static <T> Result<T> build(T body, Integer error) {
        Result<T> result = build(body);
        result.setError(error);
        return result;
    }

    public static Result success(){
        return Result.success("success");
    }

    public static Result success(String message){
        return build(null, 0, message);
    }

    public static Result success(String message, Object data){
        return build(data, 0, message);
    }

    public static Result fail(){
        return Result.fail("error");
    }

    public static Result fail(String message){
        return build(null, 1, message);
    }

    public Result<T> message(String msg){
        this.setMsg(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setError(code);
        return this;
    }

    /**
     * @return the code
     */
    public Integer getError() {
        return error;
    }

    /**
     * @param code the code to set
     */
    public void setError(Integer code) {
        this.error = code;
    }

    /**
     * @return the message
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param message the message to set
     */
    public void setMsg(String message) {
        this.msg = message;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }
    /**
     * 获得通用的返回值
     */
    public static Map<String, Object> successMap(Map<String, Object> map) {
        map.put("error", 0);
        map.put("msg", "success");
        return map;
    }
    public static Map<String, Object> failMap() {
        return failMap("error");
    }
    public static Map<String, Object> failMap(String message) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("error", 1);
        map.put("msg", message);
        return map;
    }
}