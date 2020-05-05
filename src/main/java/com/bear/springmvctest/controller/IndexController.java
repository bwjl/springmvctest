package com.bear.springmvctest.controller;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.context.config.ContextNamespaceHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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
        //RequestMappingHandlerMapping
        //InternalResourceViewResolver
        //DispatcherServlet
        //NamespaceHandlerSupport
        //ContextNamespaceHandler
    }
}
