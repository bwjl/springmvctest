package com.bear.springmvctest.service.impl;

import com.bear.springmvctest.dao.UserDao;
import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.YcgjLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/14 上午9:44
 * Description:
 */

@Service
public class YcgjLoginServiceImpl implements YcgjLoginService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean checkUser(String username) {
        return false;
    }

    public User getOne(User user) {
        return userDao.getOne(user);
    }
}
