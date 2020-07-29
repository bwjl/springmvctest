package com.bear.springmvctest.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/29 上午10:54
 * Description:
 */

@Controller
@RequestMapping("admin")
public class LoginController {

    @GetMapping("login")
    public String login() {
        return "admin/login";
    }
}
