package com.bear.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/29 上午11:49
 * Description:
 */

@Controller
@RequestMapping("/jsp")
public class JspController {

    @GetMapping("/test")
    public String test() {
        System.out.println("jsp/test");
        return "jsp/test";
    }

    @RequestMapping("/index.jsp")
    public String index() {
        System.out.println("jsp/index.jsp");
        return "jsp/index";
    }
}
