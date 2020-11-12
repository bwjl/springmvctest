package com.bear.springmvctest.entityYcgj;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表(YcUser)实体类
 *
 * @author makejava
 * @since 2020-08-07 00:47:53
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -76199046827323279L;

    private Role role;

    private Integer id;
    /**
     * 默认账号（系统生成，不可更改）
     */
    private String account;
    /**
     * 用户名（自定义）
     */
    private String username;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 开户行
     */
    private String bank;
    /**
     * 银行卡号
     */
    private String cardNo;
    /**
     * 密码
     */
    private String password;
    /**
     * 加密salt
     */
    private String salt;
    /**
     * 姓名
     */
    private String realname;
    /**
     * 状态（1-启用;2-禁用）
     */
    private Byte status;
    /**
     * 创建人ID
     */
    private Integer createId;
    /**
     * 添加时间
     */
    private Integer createTime;
    /**
     * 更新人ID
     */
    private Integer updateId;
    /**
     * 更新时间
     */
    private Integer updateTime;
    /**
     * 0-未删除；1-已删除
     */
    private Byte isDelete;


}