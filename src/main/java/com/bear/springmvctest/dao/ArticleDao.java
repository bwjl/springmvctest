package com.bear.springmvctest.dao;

import com.bear.springmvctest.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章(Article)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-28 16:11:33
 */
public interface ArticleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Article queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Article> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ycArticle 实例对象
     * @return 对象列表
     */
    List<Article> queryAll(Article ycArticle);

    /**
     * 新增数据
     *
     * @param ycArticle 实例对象
     * @return 影响行数
     */
    int insert(Article ycArticle);

    /**
     * 修改数据
     *
     * @param ycArticle 实例对象
     * @return 影响行数
     */
    int update(Article ycArticle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}