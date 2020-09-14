package com.bear.springmvctest.security;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/28 上午12:45
 * Description:
 */

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private static final long serialVersionUID = 1L;
    private String token;

    public JwtAuthenticationToken(String token) {
        super(null, null);
        this.token = token;
    }

    public String getToken() {
        return token;
    }

}
