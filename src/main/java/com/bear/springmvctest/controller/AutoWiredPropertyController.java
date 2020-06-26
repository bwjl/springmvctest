package com.bear.springmvctest.controller;

import com.bear.springmvctest.component.PersonInfo;
import com.bear.springmvctest.component.School;
import com.bear.springmvctest.entity.Order;
import com.bear.springmvctest.service.PersonService;
import com.bear.springmvctest.service.StudentService;
import com.bear.springmvctest.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/29 上午10:38
 * Description: Bean 自动装配属性
 */
@Controller
@RequestMapping("/autoWiredProperty")
public class AutoWiredPropertyController {

    /**
     * 由bean xml 自动装配（注入）
     */
    //private PersonService personService;
    //private PersonInfo personInfo;
//    private Order order;
//
//    @Autowired
//    private School school;

    private StudentService studentService;

    @RequestMapping("/index")
    @Transactional
    public void index() {
        System.out.println("autoWiredPropertyController:index");
        //System.out.println(personService);
        //System.out.println(personInfo);
        //System.out.println(order); //null
        //System.out.println(school.getPersonInfo()); //com.bear.springmvctest.component.PersonInfo@571aeb6fe
        //System.out.println();
        System.out.println(studentService.getStudent());
    }
}
