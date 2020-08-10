package com.bear.springmvctest.component;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/9 下午5:15
 * Description:
 */

@Component
public class Bear {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
