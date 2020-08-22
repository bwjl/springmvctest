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
        //---------------------200成功---------------------
        map.put(ResponseCode.CODE_200, "获取成功");
        //新增成功
        //编辑成功
        //删除成功
        //操作成功


        //---------------------400失败--------------------
        map.put(ResponseCode.CODE_400, "请求失败");
        map.put(ResponseCode.CODE_401, "token认证失败");
        map.put(ResponseCode.CODE_402, "token已过期");
        map.put(ResponseCode.CODE_40001, "用户名不存在");
        map.put(ResponseCode.CODE_40002, "用户名或密码错误");


        //---------------------500失败--------------------
    }

}
