package com.yucai.member.controller;

import com.yucai.member.pojo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: MemberController
 * Package: com.yucai.member.controller
 * Description:
 *
 * @Author liu
 * @Create 3/31/2025 7:34 PM
 * @Version 1.0
 */
@RestController
@RequestMapping("member")
public class MemberController {
    @GetMapping("/product/price")
    public Result getProjectList(){
        return Result.fail();
    }
}
