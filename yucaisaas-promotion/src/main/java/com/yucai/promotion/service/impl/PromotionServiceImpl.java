package com.yucai.promotion.service.impl;

import com.yucai.promotion.service.PromotionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ClassName: PromotionServiceImpl
 * Package: com.yucai.promotion.service.impl
 * Description:
 *
 * @Author liu
 * @Create 4/3/2025 10:34 AM
 * @Version 1.0
 */
@Slf4j
@Service
public class PromotionServiceImpl implements PromotionService {
    @Override
    public void uploadLatest3Days() {
        log.info("hello");
    }
}
