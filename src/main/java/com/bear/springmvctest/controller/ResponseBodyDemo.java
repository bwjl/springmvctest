package com.bear.springmvctest.controller;

import com.bear.springmvctest.component.ResponseBodyUser;
import com.bear.springmvctest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/10 下午11:39
 * Description: @ResponseBody 注解 对象返回自动转换为json
 */

@Controller
@RequestMapping("responseBody")
public class ResponseBodyDemo {

    @Autowired
    private ResponseBodyUser responseBodyUser;

    @GetMapping(value = "index", produces = "application/json; charset=utf-8")
    @ResponseBody
    public ResponseBodyUser index() {
        responseBodyUser.setId(100L);
        responseBodyUser.setUsername("bear");
        return responseBodyUser;
    }
}
