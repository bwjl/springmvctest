package com.bear.springmvctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/26 上午10:52
 * Description:
 */

@Controller
@RequestMapping("/path")
public class PathController {

    @Autowired
    ServletContext servletContext;

    @GetMapping("/index")
    public void index() {
        String realPath = servletContext.getRealPath("/");
        System.out.println(realPath);
        System.out.println("xxx");
    }


}
