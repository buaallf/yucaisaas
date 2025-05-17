package com.yucai.promotion.scheduled;

import com.yucai.promotion.service.PromotionService;
import com.yucai.promotion.service.RedisService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ClassName: PromotionSchedule
 * Package: com.yucai.promotion.scheduled
 * Description:
 *
 * @Author liu
 * @Create 4/3/2025 4:21 PM
 * @Version 1.0
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class PromotionSchedule {
    private final PromotionService promotionService;
    private final RedisService redisService;
    private int test;

//    @Autowired
//    public PromotionSchedule(PromotionService promotionService) {
//        this.promotionService = promotionService;
//    }

    @Async
    @Scheduled(cron = "* * * * * ?")
    public void hello() throws InterruptedException {
//        log.info("hello");
        this.promotionService.uploadLatest3Days();
        Thread.sleep(3000);
    }

}
