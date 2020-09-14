package com.bear.springmvctest.vo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/20 下午5:34
 * Description:
 */

@Data
public class LoginVo {

    private Integer id;

    private String username;

    private String phone;

    private String token;

    private Integer groupId;


}
