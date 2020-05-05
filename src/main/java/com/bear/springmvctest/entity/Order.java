package com.bear.springmvctest.entity;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/6 上午1:23
 * Description:
 */

public class Order {
    private String orderSn;
    private Double price;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
