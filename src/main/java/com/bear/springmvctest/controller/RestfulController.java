package com.bear.springmvctest.controller;

import com.bear.springmvctest.component.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/1 下午10:52
 * Description:
 */

@Controller
@RequestMapping("restful")
public class RestfulController {

    //private Object Student;

    //@Autowired
//    @Resource
//    private Student student;

    private Student student;

    @Autowired
    public RestfulController(Student student) {
        this.student = student;
    }

//    @GetMapping("index")
//    public @ResponseBody Student index() {
//
//        student.setAge(18);
//        student.setName("bear");
//        student.setClassroom("01");
//
//        return student;
//    }

    @GetMapping("index")
    public @ResponseBody
    String index() {
        return "hello world";
    }
}
