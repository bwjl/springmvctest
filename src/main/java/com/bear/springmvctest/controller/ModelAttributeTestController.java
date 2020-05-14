package com.bear.springmvctest.controller;

import com.bear.springmvctest.entity.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/6 上午1:26
 * Description:
 */

@Controller
@RequestMapping("modelAttribute")
public class ModelAttributeTestController {

    @RequestMapping("/index")
    public String index(@ModelAttribute Order order) {
        System.out.println(order.getPrice());
        System.out.println("bbb");
        return "index1";
    }
}
