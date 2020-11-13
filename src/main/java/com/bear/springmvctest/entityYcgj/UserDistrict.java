package com.bear.springmvctest.entityYcgj;

import java.io.Serializable;

/**
 * 用户区域表(YcUserDistrict)实体类
 *
 * @author makejava
 * @since 2020-11-13 15:40:13
 */
public class UserDistrict implements Serializable {
    private static final long serialVersionUID = -50683365954148747L;
    
    private Integer id;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 区域ID
    */
    private Integer districtId;
    /**
    * 名称
    */
    private String name;
    /**
    * 路径
    */
    private String paths;
    /**
    * 路径名称
    */
    private String pathsName;
    /**
    * 区域类型；1省；2市；3区；4街道；
    */
    private Integer type;
    /**
    * 创建时间
    */
    private Integer createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaths() {
        return paths;
    }

    public void setPaths(String paths) {
        this.paths = paths;
    }

    public String getPathsName() {
        return pathsName;
    }

    public void setPathsName(String pathsName) {
        this.pathsName = pathsName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

}