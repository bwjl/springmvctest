package com.bear.springmvctest.component;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午6:38
 * Description:
 */

@Component
public class Student {

    private String name;
    private Integer age;
    private String classroom;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
