package com.bear.springmvctest.controller.news;

import com.bear.springmvctest.component.PersonInfo;
import com.bear.springmvctest.component.School;
import com.bear.springmvctest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午12:46
 * Description:
 */

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private PersonInfo personInfo;

    @Autowired
    private StudentService studentService;

    //@BearAnnotion

    @GetMapping("/index")
    public String index(Model model) {
        String tips = "my first JSP page";
//        Map<String , String> tips = new HashMap<String, String>();
//        tips.put("title", "hello world");
//        tips.put("content", "WOW!This is my first JSP page");
        model.addAttribute("tips", tips);
        personInfo.setName("bear");
        model.addAttribute(personInfo);
        model.addAttribute(studentService.getStudent());
        return "news/index";
    }
}
