package com.bear.springmvctest.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/25 下午10:09
 * Description:
 */

@Controller
@RequestMapping("admin")
public class AdminController {

    /**
     * 后台首页
     */
    @GetMapping("index")
    public String index() {
        System.out.println("admin/index");
        return "admin/index";
    }

}
