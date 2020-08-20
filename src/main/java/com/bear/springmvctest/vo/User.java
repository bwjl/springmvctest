package com.bear.springmvctest.vo;

import java.io.Serializable;

/**
 * 用户信息VO
 *
 * @author bear
 * @since 2020-08-07 00:47:53
 */
public class User implements Serializable {
    private static final long serialVersionUID = -76199046827323279L;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

}