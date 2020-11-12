package com.bear.springmvctest.entityYcgj;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色表(YcRole)实体类
 *
 * @author makejava
 * @since 2020-11-11 16:22:55
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = -75911894846713659L;
    
    private Integer id;
    /**
    * 所属角色组ID
    */
    private Integer groupId;
    /**
    * 角色名称
    */
    private String name;
    /**
    * 1-系统角色；2-自定义角色
    */
    private Integer type;
    /**
    * 创建人ID
    */
    private Integer createId;
    /**
    * 创建时间
    */
    private Integer createTime;
    /**
    * 更新时间
    */
    private Integer updateTime;
    /**
    * 0-未删除；1-已删除
    */
    private Integer isDelete;

}