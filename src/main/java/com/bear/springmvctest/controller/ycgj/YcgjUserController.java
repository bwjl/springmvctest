package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.dto.UserDto;
import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.UserService;
import com.bear.springmvctest.util.ApiResultUtil;
import com.bear.springmvctest.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/6 上午10:59
 * Description:
 */

@RestController
@RequestMapping("ycgj/user")
public class YcgjUserController {

    @Resource
    private UserService userService;

    @GetMapping("getUserDetail")
    public Object getUserDetail(@RequestParam("id") Integer id) {
        User user = userService.getUserDetail(id);
        return ApiResultUtil.ok(user);
    }

    @GetMapping("getList")
    public void getList() {

    }

    @PostMapping("batchInsert")
    public Object batchInsert(@RequestBody List<UserDto> userDto) {
        int ret = userService.batchInsert(userDto);

        if (ret > 0) {
            return ApiResultUtil.ok();
        }
        return ApiResultUtil.fail();
    }

    @PostMapping("insert")
    public Object insert(@RequestBody User user) {
        User ret = userService.insert(user);
        return ApiResultUtil.ok(ret);
    }

    @GetMapping(value = "queryById", produces = "application/json; charset=utf-8")
    public User queryById(@RequestParam("id") Integer id) throws JsonProcessingException {
        User user = userService.queryById(id);
        //return JsonUtil.obj2Json(user);
        return user;
    }
}
