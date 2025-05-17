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
    // Cache the flash sale information of products from the past three days into Redis
    void uploadLatest3Days();
}
