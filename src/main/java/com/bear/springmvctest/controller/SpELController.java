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

    @Value("#{'bear'}")
    private String name;

//    @Value("${defaultViewResolver.prefix}")
//    private String prefix;

    @GetMapping("index")
    public void index() {
        System.out.println(name); //bear
//        System.out.println(prefix); //bear
    }

}
