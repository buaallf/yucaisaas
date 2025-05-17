package com.yucai.promotion.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: MemberFeignService
 * Package: com.yucai.promotion.feign
 * Description:
 *
 * @Author liu
 * @Create 5/17/2025 7:53 PM
 * @Version 1.0
 */
@FeignClient("yucaisaas-member")
public interface MemberFeignService {
}
