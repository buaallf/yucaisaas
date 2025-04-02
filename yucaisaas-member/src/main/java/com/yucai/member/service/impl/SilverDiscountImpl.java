package com.yucai.member.service.impl;

import com.yucai.member.service.DiscountStrategy;

/**
 * ClassName: SilverDiscountImpl
 * Package: com.yucai.member.service.impl
 * Description:
 *
 * @Author liu
 * @Create 3/31/2025 7:37 PM
 * @Version 1.0
 */
public class SilverDiscountImpl implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return 0;
    }
}
