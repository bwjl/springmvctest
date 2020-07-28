package com.bear.springmvctest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/28 上午1:05
 * Description:
 */

public class SecurityWebInitializer {

    public SecurityWebInitializer() {
        System.out.println("SecurityWebInitializer");
    }

}
