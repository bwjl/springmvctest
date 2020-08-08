package com.bear.springmvctest.entity;

import java.io.Serializable;

/**
 * 烟草商品表(YcGoods)实体类
 *
 * @author bear
 * @since 2020-08-08 00:26:20
 */
public class YcGoods implements Serializable {
    private static final long serialVersionUID = 597168657424670725L;

    private Object id;
    /**
     * 烟草条码
     */
    private String barCode;
    /**
     * 品名
     */
    private String goodsName;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 品类
     */
    private String category;
    /**
     * 零售价(盒包装)
     */
    private Object price;
    /**
     * 零售价(条包装)
     */
    private Object itemPrice;
    /**
     * 产地
     */
    private String origin;
    /**
     * 产地id
     */
    private Object originId;
    /**
     * 生产年份
     */
    private String productionYear;
    /**
     * 香烟类型
     */
    private String goodsType;
    /**
     * 焦油量
     */
    private String tar;
    /**
     * 计价单位(盒包装)
     */
    private String unit;
    /**
     * 期数
     */
    private String periodNum;
    /**
     * 物价员
     */
    private String priceClerk;
    /**
     * 商品条码(条包装)
     */
    private Object itemBarCode;
    /**
     * 备注
     */
    private String remark;
    /**
     * 省id
     */
    private Object provinceId;
    /**
     * 市id
     */
    private Object cityId;
    /**
     *  区id
     */
    private Object areaId;
    /**
     * 街道id
     */
    private Object streetId;
    /**
     * 创建者id
     */
    private Object createId;
    /**
     * 更新者id
     */
    private Object updateId;
    /**
     * 创建时间
     */
    private Object createTime;
    /**
     * 更新时间
     */
    private Object updateTime;
    /**
     * 1；已删除；0；未删除；
     */
    private Object isDelete;
    /**
     * 计价单位(条包装)
     */
    private String itemUnit;
    /**
     * 类别
     */
    private String cat;
    /**
     * 规格
     */
    private String standards;
    /**
     * 成本价
     */
    private Object costPrice;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Object getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Object itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Object getOriginId() {
        return originId;
    }

    public void setOriginId(Object originId) {
        this.originId = originId;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getTar() {
        return tar;
    }

    public void setTar(String tar) {
        this.tar = tar;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(String periodNum) {
        this.periodNum = periodNum;
    }

    public String getPriceClerk() {
        return priceClerk;
    }

    public void setPriceClerk(String priceClerk) {
        this.priceClerk = priceClerk;
    }

    public Object getItemBarCode() {
        return itemBarCode;
    }

    public void setItemBarCode(Object itemBarCode) {
        this.itemBarCode = itemBarCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Object getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Object provinceId) {
        this.provinceId = provinceId;
    }

    public Object getCityId() {
        return cityId;
    }

    public void setCityId(Object cityId) {
        this.cityId = cityId;
    }

    public Object getAreaId() {
        return areaId;
    }

    public void setAreaId(Object areaId) {
        this.areaId = areaId;
    }

    public Object getStreetId() {
        return streetId;
    }

    public void setStreetId(Object streetId) {
        this.streetId = streetId;
    }

    public Object getCreateId() {
        return createId;
    }

    public void setCreateId(Object createId) {
        this.createId = createId;
    }

    public Object getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Object updateId) {
        this.updateId = updateId;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards;
    }

    public Object getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Object costPrice) {
        this.costPrice = costPrice;
    }

}