package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.UserService;
import com.bear.springmvctest.service.YcgjLoginService;
import com.bear.springmvctest.util.ApiResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "登录")
public class YcgjLoginController {

    @Autowired
    private YcgjLoginService ycgjLoginService;

    @Autowired
    private UserService userService;

    @PostMapping("login")
    @ApiOperation(value = "后台登录")
    public @ResponseBody
    Object index(@RequestParam("username") String username, @RequestParam("password") String password) {
        //public @ResponseBody Object index(@ModelAttribute User user) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        //入参validate
        //return userService.getOne(user);
        return ApiResultUtil.ok(userService.getOne(user));
    }

}
