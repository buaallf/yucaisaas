package com.yucai.promotion.service;

/**
 * ClassName: PromotionService
 * Package: com.yucai.promotion.pojo
 * Description:
 *
 * @Author liu
 * @Create 4/3/2025 10:33 AM
 * @Version 1.0
 */
public interface PromotionService {
    // 将 最近三天的商品秒杀活动信息 缓存到Redis中
    void uploadLatest3Days();
}
