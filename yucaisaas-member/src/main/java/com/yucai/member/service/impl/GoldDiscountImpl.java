package com.yucai.member.service.impl;

import com.yucai.member.service.DiscountStrategy;

/**
 * ClassName: GoldDiscountImpl
 * Package: com.yucai.member.service.impl
 * Description:
 *
 * @Author liu
 * @Create 3/31/2025 7:38 PM
 * @Version 1.0
 */
public class GoldDiscountImpl implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return 0;
    }
}
