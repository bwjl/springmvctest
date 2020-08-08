package com.bear.springmvctest.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/8 上午11:28
 * Description:
 */

public class JsonUtil {

    /**
     * 对象转json字符串
     * @param object
     * @return
     * @throws JsonProcessingException
     */
    public static String obj2Json(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}
