package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.UserService;
import com.bear.springmvctest.service.YcgjLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/13 下午5:18
 * Description:
 */

@Controller
@RequestMapping("ycgj")
public class YcgjLoginController {

    @Autowired
    private YcgjLoginService ycgjLoginService;

    @Autowired
    private UserService userService;

    //public @ResponseBody Object index(@RequestParam("username") String username, @RequestParam("password") String password)
    @PostMapping("login")
    public @ResponseBody
    Object index(@ModelAttribute User user) {

        //入参validate
        return userService.getOne(user);
    }

}
