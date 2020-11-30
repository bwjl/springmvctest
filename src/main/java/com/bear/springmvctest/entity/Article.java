package com.bear.springmvctest.entity;

import java.io.Serializable;

/**
 * 文章(YcArticle)实体类
 *
 * @author makejava
 * @since 2020-11-28 16:17:22
 */
public class Article implements Serializable {
    private static final long serialVersionUID = -85708722125398142L;

    private Object id;
    /**
     * 文章分类
     */
    private Object catId;
    /**
     * 文章编辑人id
     */
    private Object createId;
    /**
     * 更新人
     */
    private Object updateId;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章来源
     */
    private String source;
    /**
     * 跳转链接
     */
    private String redirectUrl;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 附件地址
     */
    private String attachmentUrl;
    /**
     * 排序
     */
    private Object sort;
    /**
     * 0未删除；1已经删除
     */
    private Object isDelete;
    /**
     * 文章发表时间
     */
    private Object publishTime;
    /**
     * 创建时间
     */
    private Object createTime;
    /**
     * 更新时间
     */
    private Object updateTime;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getCatId() {
        return catId;
    }

    public void setCatId(Object catId) {
        this.catId = catId;
    }

    public Object getCreateId() {
        return createId;
    }

    public void setCreateId(Object createId) {
        this.createId = createId;
    }

    public Object getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Object updateId) {
        this.updateId = updateId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public Object getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Object isDelete) {
        this.isDelete = isDelete;
    }

    public Object getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Object publishTime) {
        this.publishTime = publishTime;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

}