package com.bear.springmvctest.service;

import com.bear.springmvctest.dto.LoginResult;
import com.bear.springmvctest.dto.UserDto;
import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.vo.LoginVo;

import java.util.List;

/**
 * 用户表(User)表服务接口
 *
 * @author bear
 * @since 2020-08-08 00:53:41
 */

public interface UserService {

    /**
     * 校验用户名是否存在
     *
     * @param username
     * @return
     */
    boolean checkUsernameIsExist(String username);

    /**
     * 校验用户登录
     *
     * @return
     */
    boolean checkPassword(String username, String password);

    /**
     * 获取登录返回结果
     *
     * @param username
     * @return
     */
    LoginVo getLoginResult(String username);

    /**
     * @param user
     * @return
     */
    User getOne(User user);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 批量插入
     *
     * @param user
     * @return
     */
    int batchInsert(List<UserDto> user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}