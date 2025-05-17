package com.yucai.promotion.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: SkuInfoVo
 * Package: com.yucai.promotion.pojo
 * Description:
 *
 * @Author liu
 * @Create 5/17/2025 7:51 PM
 * @Version 1.0
 */
@Data
public class SkuInfoVo {
    /**
     * SKU ID
     */
    private Long skuId;
    /**
     * SPU ID
     */
    private Long spuId;
    /**
     * SKU name
     */
    private String skuName;
    /**
     * SKU description
     */
    private String skuDesc;
    /**
     * Category ID
     */
    private Long catalogId;
    /**
     * Brand ID
     */
    private Long brandId;
    /**
     * Default image
     */
    private String skuDefaultImg;
    /**
     * Title
     */
    private String skuTitle;
    /**
     * Subtitle
     */
    private String skuSubtitle;
    /**
     * Price
     */
    private BigDecimal price;
    /**
     * Sales volume
     */
    private Long saleCount;
}
