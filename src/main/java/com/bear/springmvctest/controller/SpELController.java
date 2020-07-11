package com.bear.springmvctest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/27 上午11:29
 * Description: SpEL(Spring Expression Language)
 */

@Controller
@RequestMapping("SpEL")
public class SpELController {

    @Value("#{order.orderSn}") //获取bean中属性
    private String prefix;

    @Value("#{'bear'}") //可以表示常量值
    private String name;

    @Value("${springframework.version}")
    private String springFrameworkVersion;

    @GetMapping("index")
    public void index() {
        System.out.println(name); //bear
        System.out.println(prefix); //bear
        System.out.println(springFrameworkVersion); //bear

    }

}
