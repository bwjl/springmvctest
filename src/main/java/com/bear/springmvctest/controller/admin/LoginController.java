package com.bear.springmvctest.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/29 下午4:26
 * Description:
 */
@Controller
@RequestMapping("admin")
public class LoginController {

    @GetMapping("login")
    public String index() {

        System.out.println("admin/login");
        return "admin/login";
    }
}
