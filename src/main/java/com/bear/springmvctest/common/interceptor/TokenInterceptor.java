package com.bear.springmvctest.common.interceptor;

import com.bear.springmvctest.constant.ResponseCode;
import com.bear.springmvctest.util.ApiResultUtil;
import com.bear.springmvctest.util.JwtUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/21 下午2:52
 * Description:
 */

public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = request.getHeader("Authorization");
        if (token == null) { //token 未设置
            responseMessage(response, ApiResultUtil.fail(ResponseCode.CODE_401));
            return false;
        }

        //先验证token认证失败
        if (!jwtUtil.validateToken(token)) {
            responseMessage(response, ApiResultUtil.fail(ResponseCode.CODE_401));
            return false;
        }

        if (jwtUtil.isTokenExpired(token)) { //token已过期
            responseMessage(response, ApiResultUtil.fail(ResponseCode.CODE_402));
            return false;
        }

        return true;
    }

    /**
     * @param response
     * @param object
     * @throws IOException
     */
    private void responseMessage(HttpServletResponse response, Object object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        response.setContentType("application/json; charset=utf-8");
        response.getWriter().write(objectMapper.writeValueAsString(object));
    }


}
