package com.bear.springmvctest.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/13 下午5:19
 * Description:
 */


public class ApiResultUtil {

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

    public ApiResultUtil putDataValue(String key, Object value) {
        data.put(key, value);
        return this;
    }

    private ApiResultUtil(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiResultUtil ok() {
        return new ApiResultUtil(200, "Ok");
    }

    public static ApiResultUtil notFound() {
        return new ApiResultUtil(404, "Not Found");
    }

    public static ApiResultUtil badRequest() {
        return new ApiResultUtil(400, "Bad Request");
    }

    public static ApiResultUtil forbidden() {
        return new ApiResultUtil(403, "Forbidden");
    }

    public static ApiResultUtil unauthorized() {
        return new ApiResultUtil(401, "unauthorized");
    }

    public static ApiResultUtil serverInternalError() {
        return new ApiResultUtil(500, "Server Internal Error");
    }

    public static ApiResultUtil customerError() {
        return new ApiResultUtil(1001, "customer Error");
    }
}

