package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.UserService;
import com.bear.springmvctest.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/6 上午10:59
 * Description:
 */

@Controller
@RequestMapping("ycgj/user")
public class YcgjUserController {

    @Resource
    private UserService userService;

    @GetMapping("getList")
    public void getList() {

    }

    @GetMapping(value = "queryById", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String queryById(@RequestParam("id") Integer id) throws JsonProcessingException {
        User user = userService.queryById(id);
        return JsonUtil.obj2Json(user);

    }
}
