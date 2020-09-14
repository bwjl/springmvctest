package com.bear.springmvctest.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/3 上午11:22
 * Description:
 */

public class JwtAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest arg0, HttpServletResponse arg1, Authentication arg2)
            throws IOException, ServletException {
        System.out.println("JwtAuthenticationSuccessHandler.onAuthenticationSuccess()...");
        // 因為預設的AuthenticationSuccessHandler通過驗證後會重新導向到發出請求時的頁面, 所以這邊要複寫掉不做任何事
    }

}
