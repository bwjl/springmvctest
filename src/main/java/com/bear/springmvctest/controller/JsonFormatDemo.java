package com.bear.springmvctest.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/11 下午5:29
 * Description:
 */

@RestController
public class JsonFormatDemo {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Integer createTime = 1591856308;


    @GetMapping("jsonFormatDemo")
    public String jsonFormatDemo() {
        System.out.println(createTime);
        return createTime.toString();
    }

}
