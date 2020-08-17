package com.bear.springmvctest.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/18 上午12:27
 * Description: 响应Map
 */

public class ResponseMap {

    public final static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(ResponseCode.CODE_200, "获取成功");
    }

}
