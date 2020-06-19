package com.bear.springmvctest.component;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/28 下午2:14
 * Description:
 */

public class PersonInfo {

    public PersonInfo() { //bean 在spring启动的时候自动实例化
        System.out.println("constructor:com.bear.springmvctest.component.PersonInfo");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
