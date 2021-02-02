package com.bear.springmvctest.common.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/1 下午4:29
 * Description:
 */

public class DalAop {

    private static final String CREATE_TIME = "createTime";
    private static final String UPDATE_TIME = "updateTime";

    public void beforeInsert(JoinPoint joinPoint) {

        System.out.println("beforeInsert");

        Object[] args = joinPoint.getArgs();

        if (args != null && args.length > 0) {
            Object arg = args[0];
            BeanWrapper beanWrapper = new BeanWrapperImpl(arg);
            if (beanWrapper.isWritableProperty(CREATE_TIME)) {
                beanWrapper.setPropertyValue(CREATE_TIME, (int) (System.currentTimeMillis() / 1000L));
            }

            if (beanWrapper.isWritableProperty(UPDATE_TIME)) {
                beanWrapper.setPropertyValue(UPDATE_TIME, (int) (System.currentTimeMillis() / 1000L));
            }

            if (beanWrapper.isWritableProperty("xxx")) {

                System.out.println("xxx");
            }
        }

    }

    public void beforeUpdate(JoinPoint joinPoint) {

        System.out.println("beforeUpdate");

        Object[] args = joinPoint.getArgs();

        if (args != null && args.length > 0) {

        }

    }

}
