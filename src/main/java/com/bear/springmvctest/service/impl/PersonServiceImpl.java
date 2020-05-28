package com.bear.springmvctest.service.impl;

import com.bear.springmvctest.component.PersonInfo;
import com.bear.springmvctest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
//import com.bear.springmvctest.entity.Person;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/28 下午2:23
 * Description:
 */

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonInfo personInfo;

    public void setPersonName(String name) throws InterruptedException {
        System.out.println("setPersonName name value is :" + personInfo.getName());
        personInfo.setName(name);

        TimeUnit.SECONDS.sleep(10);
    }

    public void getPersonName() {
        System.out.println("getPersonName name value is :" + personInfo.getName());
    }


}
