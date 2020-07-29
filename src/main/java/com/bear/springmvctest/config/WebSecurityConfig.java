package com.bear.springmvctest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.authentication.AuthenticationManagerFactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/27 下午3:43
 * Description: WebSecurityConfig
 */

//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
////        httpSecurity.authorizeRequests().antMatchers("/**").permitAll().anyRequest()
////                .hasRole("USER").and()
////                // Possibly more configuration ...
////                .formLogin() // enable form based log in
////                // set permitAll for all URLs associated with Form Login
////                .permitAll();
//
//        //httpSecurity.csrf().disable();
//    }
//
//}