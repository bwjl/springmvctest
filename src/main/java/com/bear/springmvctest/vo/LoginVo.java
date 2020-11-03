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

    private String account;

    private String phone;

    private String realname;

    private String cardNo;

    private String username;

    private Byte status;

    private Integer roleId;

    private String roleName;

    private Integer groupId;

    private Integer groupLevel;

    private String token;


}
