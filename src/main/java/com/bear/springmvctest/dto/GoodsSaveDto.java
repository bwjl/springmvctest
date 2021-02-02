package com.bear.springmvctest.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 烟草商品表(YcGoods)实体类
 *
 * @author bear
 * @since 2020-08-08 00:26:20
 */

@Data
public class GoodsSaveDto implements Serializable {
    private static final long serialVersionUID = 597168657424670725L;

    private String barCode;

    private String goodsName;

    private String brand;

    private String category;

    private BigDecimal price;

    private BigDecimal itemPrice;

    private String origin;

    private Integer originId;

    private String productionYear;

    private String goodsType;

    private String tar;

    private String unit;

    private String periodNum;

    private String priceClerk;

    private String itemBarCode;

    private String remark;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private Integer streetId;

    private Integer createId;

    private Integer updateId;

    private Integer createTime;

    private Integer updateTime;

    private Short isDelete;

    private String itemUnit;

    private String cat;

    private String standards;

    private BigDecimal costPrice;

    @Override
    public String toString() {
        return "GoodsSaveDto{" +
                "barCode='" + barCode + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", itemPrice=" + itemPrice +
                ", origin='" + origin + '\'' +
                ", originId=" + originId +
                ", productionYear='" + productionYear + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", tar='" + tar + '\'' +
                ", unit='" + unit + '\'' +
                ", periodNum='" + periodNum + '\'' +
                ", priceClerk='" + priceClerk + '\'' +
                ", itemBarCode='" + itemBarCode + '\'' +
                ", remark='" + remark + '\'' +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", areaId=" + areaId +
                ", streetId=" + streetId +
                ", createId=" + createId +
                ", updateId=" + updateId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDelete=" + isDelete +
                ", itemUnit='" + itemUnit + '\'' +
                ", cat='" + cat + '\'' +
                ", standards='" + standards + '\'' +
                ", costPrice=" + costPrice +
                '}';
    }
}