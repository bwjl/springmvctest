package com.bear.springmvctest.util;

import com.bear.springmvctest.constant.ResponseCode;
import com.bear.springmvctest.constant.ResponseMap;
import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2019-08-28 16:16
 * Description:
 */

/**
 * 响应操作结果
 * <pre>
 *  {
 *      code： 错误码，
 *      msg：错误消息，
 *      data：  响应数据
 *  }
 * </pre>
 *
 * <p>
 * 错误码：
 * <ul>
 * <li> 0，成功；
 * <li> 4xx，前端错误，说明前端开发者需要重新了解后端接口使用规范：
 * <ul>
 * <li> 401，参数错误，即前端没有传递后端需要的参数；
 * <li> 402，参数值错误，即前端传递的参数值不符合后端接收范围。
 * </ul>
 * <li> 5xx，后端错误，除501外，说明后端开发者应该继续优化代码，尽量避免返回后端错误码：
 * <ul>
 * <li> 501，验证失败，即后端要求用户登录；
 * <li> 502，系统内部错误，即没有合适命名的后端内部错误；
 * <li> 503，业务不支持，即后端虽然定义了接口，但是还没有实现功能；
 * <li> 504，更新数据失效，即后端采用了乐观锁更新，而并发更新时存在数据更新失效；
 * <li> 505，更新数据失败，即后端数据库更新失败（正常情况应该更新成功）。
 * </ul>
 * <li> 6xx，小商城后端业务错误码，
 * 具体见litemall-admin-api模块的AdminResponseCode。
 * <li> 7xx，管理后台后端业务错误码，
 * 具体见litemall-wx-api模块的WxResponseCode。
 * </ul>
 */
public class ApiResultUtil {
    /**
     * 获取成功
     *
     * @return
     */
    public static Object ok() {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", ResponseCode.CODE_200);
        obj.put("msg", ResponseMap.map.get(ResponseCode.CODE_200));
        return obj;
    }

    /**
     * 根据code码返回
     *
     * @param code
     * @return
     */
    public static Object ok(Integer code) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", code);
        obj.put("msg", ResponseMap.map.get(code));
        return obj;
    }

    /**
     * 获取成功
     *
     * @param data
     * @return
     */
    public static Object ok(Object data) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", ResponseCode.CODE_200);
        obj.put("msg", ResponseMap.map.get(ResponseCode.CODE_200));
        obj.put("data", data);
        return obj;
    }

    /**
     * 根据状态码返回
     *
     * @param data
     * @param code
     * @return
     */
    public static Object ok(Object data, Integer code) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", ResponseCode.CODE_200);
        obj.put("msg", ResponseMap.map.get(ResponseCode.CODE_200));
        obj.put("data", data);
        return obj;
    }


    /**
     * 获取成功
     *
     * @param list
     * @return
     */
    public static Object okList(List list) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("list", list);

        if (list instanceof Page) {
            Page page = (Page) list;
            data.put("total", page.getTotal());
            data.put("page", page.getPageNum());
            data.put("limit", page.getPageSize());
            data.put("pages", page.getPages());
        } else {
            data.put("total", list.size());
            data.put("page", 1);
            data.put("limit", list.size());
            data.put("pages", 1);
        }

        return ok(data);
    }

    public static Object okList(List list, List pagedList) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("list", list);

        if (pagedList instanceof Page) {
            Page page = (Page) pagedList;
            data.put("total", page.getTotal());
            data.put("page", page.getPageNum());
            data.put("limit", page.getPageSize());
            data.put("pages", page.getPages());
        } else {
            data.put("total", pagedList.size());
            data.put("page", 1);
            data.put("limit", pagedList.size());
            data.put("pages", 1);
        }

        return ok(data);
    }


    public static Object fail(String message) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", -1);
        obj.put("msg", message);
        return obj;
    }


    public static Object fail() {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", -1);
        obj.put("msg", "错误");
        return obj;
    }

    public static Object fail(int code, String msg) {
        Map<String, Object> obj = new HashMap<String, Object>();
        obj.put("code", code);
        obj.put("msg", msg);
        return obj;
    }

    public static Object badArgument() {
        return fail(401, "参数不对");
    }

    public static Object badArgumentValue() {
        return fail(402, "参数值不对");
    }

    public static Object unlogin() {
        return fail(501, "请登录");
    }

    public static Object serious() {
        return fail(502, "系统内部错误");
    }

    public static Object unsupport() {
        return fail(503, "业务不支持");
    }

    public static Object updatedDateExpired() {
        return fail(504, "更新数据已经失效");
    }

    public static Object updatedDataFailed() {
        return fail(505, "更新数据失败");
    }

    public static Object unauthz() {
        return fail(506, "无操作权限");
    }
}