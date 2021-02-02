package com.bear.springmvctest.common.aop;

import org.aspectj.lang.JoinPoint;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/1 下午4:29
 * Description:
 */

public class DalAop {

    private static final String CREATOR = "creator";
    private static final String MODIFIER = "modifier";
    private static final String GMTCREATE = "gmtCreate";
    private static final String GMTMODIFIED = "gmtModified";

    public void beforeInsert(JoinPoint joinPoint) {

        System.out.println("beforeInsert");

        Object[] args = joinPoint.getArgs();

        if (args != null && args.length > 0) {

        }

    }

    public void beforeUpdate(JoinPoint joinPoint) {

        System.out.println("beforeUpdate");

        Object[] args = joinPoint.getArgs();

        if (args != null && args.length > 0) {

        }

    }

}
