package com.bear.springmvctest.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/11 下午12:52
 * Description:
 */

public class BeanDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
