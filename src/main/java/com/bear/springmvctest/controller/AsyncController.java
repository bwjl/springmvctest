package com.bear.springmvctest.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/5 下午11:26
 * Description: 异步方法
 */

@Controller
@RequestMapping("async")
public class AsyncController {

    @GetMapping("index")
    @Async
    public void index() {
        System.out.println("Async function");
    }
}
