package com.bear.springmvctest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/3 上午11:45
 * Description:
 */

@Controller
@RequestMapping("swagger")
@Api(tags = "swagger配置")
public class SwaggerDemoController {

    @GetMapping("index")
    @ApiOperation(value = "swagger方法")
    public String index() {
        return "hello";
    }
}
