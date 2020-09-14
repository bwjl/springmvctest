package com.bear.springmvctest.security;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/28 上午12:46
 * Description:
 */

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;


public class JwtAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    @Override
    public boolean supports(Class authentication) {
        System.out.println("JwtAuthenticationProvider.supports()...");
        return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
    }

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
        System.out.println("JwtAuthenticationProvider.additionalAuthenticationChecks()...");
        // 此方法用來做驗證, 但JWT在從token時就必須驗證, 所以這邊不用做任何事
    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication)
            throws AuthenticationException {
        System.out.println("JwtAuthenticationProvider.retrieveUser()...");

        // authentication物件從AuthenticationManager傳過來
        JwtAuthenticationToken jwtAuthenticationToken = (JwtAuthenticationToken) authentication;
        String token = jwtAuthenticationToken.getToken();

        User parsedUser = JwtUtil.parseToken(token);
        if (parsedUser == null) {
            throw new JwtTokenMalformedException("JWT token is not valid");
        }

        return parsedUser;
    }

}
