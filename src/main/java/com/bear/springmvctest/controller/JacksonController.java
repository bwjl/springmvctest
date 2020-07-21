package com.bear.springmvctest.controller;

import com.bear.springmvctest.component.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/2 上午12:20
 * Description:
 */

@Controller
@RequestMapping("jackson")
public class JacksonController {

    @Autowired
    private Student student;

    @GetMapping("json2Obj")
    @ResponseBody
    public String json2Obj() throws JsonProcessingException {
        String str = "{\"name\":\"bear\",\"age\":18,\"classroom\":\"01\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(str, Student.class).toString();
    }


    @GetMapping(value = "obj2Json", produces = "application/json; charset=utf-8")
    public @ResponseBody
    String obj2Json() throws JsonProcessingException {

        student.setAge(18);
        student.setName("bear");
        student.setClassroom("01");

        //"{\"name\":\"bear\",\"age\":18,\"classroom\":\"01\"}"

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(student);
    }

}
