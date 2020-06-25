package com.bear.springmvctest.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/5/28 下午2:18
 * Description:
 */

public interface PersonService {

    public void getPersonName();

    public void setPersonName(String name) throws InterruptedException;


}
