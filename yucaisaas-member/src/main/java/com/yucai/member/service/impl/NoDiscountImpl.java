package com.yucai.member.service.impl;

import com.yucai.member.service.DiscountStrategy;
import org.springframework.stereotype.Service;

/**
 * ClassName: NoDiscount
 * Package: com.yucai.member.service.impl
 * Description:
 *
 * @Author liu
 * @Create 3/31/2025 7:36 PM
 * @Version 1.0
 */
@Service
public class NoDiscountImpl implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return 0;
    }
}
