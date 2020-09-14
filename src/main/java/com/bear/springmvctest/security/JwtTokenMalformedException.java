package com.bear.springmvctest.security;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/28 上午12:48
 * Description:
 */

import org.springframework.security.core.AuthenticationException;

public class JwtTokenMalformedException extends AuthenticationException {
    private static final long serialVersionUID = 1L;

    public JwtTokenMalformedException(String msg) {
        super(msg);
    }

}