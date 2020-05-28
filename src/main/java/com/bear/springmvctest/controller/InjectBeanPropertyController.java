package com.bear.springmvctest.controller;

import com.bear.springmvctest.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/28 下午10:46
 * Description: 注入bean属性
 */

@Controller
@RequestMapping("/injectBeanProperty")
public class InjectBeanPropertyController {

    @Autowired
    private Order order;

    @RequestMapping("/index")
    public void index() {
        //Order order = new Order();
        System.out.println(order.getOrderSn());
    }
}
