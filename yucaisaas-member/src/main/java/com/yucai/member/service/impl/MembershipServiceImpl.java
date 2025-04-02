package com.yucai.member.service.impl;

import com.yucai.member.pojo.MembershipLevel;
import com.yucai.member.service.DiscountStrategy;
import com.yucai.member.service.MembershipService;
import com.yucai.member.service.PointsStrategy;
import org.springframework.stereotype.Service;

/**
 * ClassName: MembershipImpl
 * Package: com.yucai.member.service.impl
 * Description:
 *
 * @Author liu
 * @Create 3/31/2025 7:33 PM
 * @Version 1.0
 */
@Service
public class MembershipServiceImpl implements MembershipService {
    private MembershipLevel level;
    private DiscountStrategy discountStrategy;
    private PointsStrategy pointsStrategy;
}
