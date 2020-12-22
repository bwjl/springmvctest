package com.bear.springmvctest.controller;

import com.bear.springmvctest.util.RedisUtil;
import com.bear.springmvctest.util.RedisUtilBak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/18 上午10:32
 * Description:
 */

@RestController
@RequestMapping("redis")
public class RedisDemo {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("test")
    public void test() {

//        Boolean ret = RedisUtilBak.exists("staticData");
//        System.out.println(ret);

//        //set
//        List<String> list =  new ArrayList<>();
//        list.add("bear");
//        list.add("dog");
//        list.add("cat");
//        /**
//         * 缓存list 链表数据
//         */
//        RedisUtilBak.setCacheList("REDIS_LIST", list);

        /**
         * 缓存字符串
         */
//        RedisUtilBak.setCacheObject("REDIS_STRING", "hello word");
//        System.out.println((char[]) RedisUtilBak.getCacheObject("REDIS_STRING"));
        redisUtil.set("REDIS_STRING", "hello word", 600L);
        redisUtil.set("REDIS_STRING1", "hello wordxxx", 600L);
        System.out.println(redisUtil.get("REDIS_STRING"));

        redisUtil.hSet("REDIS_HASH", "13986004080", "139191");
        redisUtil.expire("REDIS_HASH", 60L);

    }

}
