package com.bear.springmvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/4/26 下午10:20
 * Description:
 */

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
