package com.bear.springmvctest.controller;

import com.bear.springmvctest.component.Bear;
import com.bear.springmvctest.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/28 下午10:46
 * Description: 注入bean属性
 */

@Controller
@RequestMapping("injectBeanProperty")
public class InjectBeanPropertyController {

    @Autowired
    private Order order;

    @Resource
    private Bear bear;

    @RequestMapping("/index")
    public void index() {
        System.out.println(order.getOrderSn());
        System.out.println(bear.getName());
    }
}
