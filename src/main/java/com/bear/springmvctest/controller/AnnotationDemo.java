package com.bear.springmvctest.controller;

import com.bear.springmvctest.entity.PersonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/28 上午11:00
 * Description:
 */

@RestController
@RequestMapping("annotation")
public class AnnotationDemo {

    @Value("#{555}")
    private String hobby;

    @Autowired
    private PersonValue personValue;

    @GetMapping("value")
    public void value() {
        //PersonValue personValue = new PersonValue();
        System.out.println(hobby);
        System.out.println(personValue); //通过依赖注入
    }

}
