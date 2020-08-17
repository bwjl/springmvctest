package com.bear.springmvctest.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/13 下午5:19
 * Description:
 */


public class ApiResultUtilDemo1 {

    private final String message;
    private final int code;
    private final Map<String, Object> data = new HashMap<String, Object>();

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public ApiResultUtilDemo1 putDataValue(String key, Object value) {
        data.put(key, value);
        return this;
    }

    private ApiResultUtilDemo1(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiResultUtilDemo1 ok() {
        return new ApiResultUtilDemo1(200, "Ok");
    }

    public static ApiResultUtilDemo1 notFound() {
        return new ApiResultUtilDemo1(404, "Not Found");
    }

    public static ApiResultUtilDemo1 badRequest() {
        return new ApiResultUtilDemo1(400, "Bad Request");
    }

    public static ApiResultUtilDemo1 forbidden() {
        return new ApiResultUtilDemo1(403, "Forbidden");
    }

    public static ApiResultUtilDemo1 unauthorized() {
        return new ApiResultUtilDemo1(401, "unauthorized");
    }

    public static ApiResultUtilDemo1 serverInternalError() {
        return new ApiResultUtilDemo1(500, "Server Internal Error");
    }

    public static ApiResultUtilDemo1 customerError() {
        return new ApiResultUtilDemo1(1001, "customer Error");
    }
}

