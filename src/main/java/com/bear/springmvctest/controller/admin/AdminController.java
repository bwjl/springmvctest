package com.bear.springmvctest.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

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
    public String index(@RequestParam("empIds") Integer[] empIds) {

        System.out.println("admin/index");
        return "admin/index";
    }

    /**
     * java get接收数组参数与php区别
     */
    @GetMapping("getParam")
    public String getParam(@RequestParam("empIds") Integer[] empIds) {
        //?empIds=650&empIds=649
        System.out.println("xxx");
        System.out.println(empIds);
        for (int i = 0; i < empIds.length; i++) {
            System.out.println(empIds[i]);
        }
        return "admin/index";
    }

    /**
     * post接收数组参数与php区别
     */
    @PostMapping("postParam")
    public String postParam(@RequestParam("empIds") Integer[] empIds) {
        //?empIds=650&empIds=649
        System.out.println(empIds);
        for (int i = 0; i < empIds.length; i++) {
            System.out.println(empIds[i]);
        }
        return "admin/index";
    }

}
