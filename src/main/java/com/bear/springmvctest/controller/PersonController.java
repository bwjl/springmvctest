package com.bear.springmvctest.controller;

import com.bear.springmvctest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/28 下午2:17
 * Description:
 */
@Controller
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/index")
    public void index(@RequestParam("name") String name) throws InterruptedException {
        personService.setPersonName(name);
        personService.getPersonName();
    }
}
