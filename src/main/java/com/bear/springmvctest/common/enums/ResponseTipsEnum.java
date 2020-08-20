package com.bear.springmvctest.common.enums;

/**
 * 请求响应提示
 */
public enum ResponseTipsEnum {

    FETCH_SUCCESS(200, "获取成功");

    private int code;
    private String tips;

    ResponseTipsEnum(int code, String tips) {

    }
}
