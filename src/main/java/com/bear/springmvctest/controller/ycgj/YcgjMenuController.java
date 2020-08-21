package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.util.ApiResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/21 下午2:24
 * Description:
 */

@Controller
@RequestMapping("ycgj/manage")
public class YcgjMenuController {

    @GetMapping("menu")
    public @ResponseBody
    Object menu() {
        return ApiResultUtil.ok();
    }

}
