package com.bear.springmvctest.component;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/22 下午11:24
 * Description:
 */

@Component
public class ResponseBodyUser {

    private Long Id;
    private String username;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
