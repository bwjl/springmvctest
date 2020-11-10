package com.bear.springmvctest.service.impl;

import com.bear.springmvctest.dao.UserDao;
import com.bear.springmvctest.dto.LoginResult;
import com.bear.springmvctest.dto.UserDto;
import com.bear.springmvctest.entityYcgj.User;
import com.bear.springmvctest.service.UserService;
import com.bear.springmvctest.vo.LoginVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


import java.util.List;

/**
 * 用户表(User)表服务实现类
 *
 * @author bear
 * @since 2020-08-08 00:53:41
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public boolean checkUsernameIsExist(String username) {
        User user = new User();
        user.setUsername(username);
        User userDetail = userDao.getOne(user);

        return userDetail != null;
    }

    public boolean checkPassword(String username, String password) {
        User user = new User();
        user.setUsername(username);
        User userDetail = userDao.getOne(user);

        return encryptPassword(password, userDetail.getSalt()).equals(userDetail.getPassword());
    }

    @Override
    public LoginVo getLoginResult(String username) {
        LoginResult loginResult = userDao.getLoginResult(username);
        LoginVo loginVo = new LoginVo();
        BeanUtils.copyProperties(loginResult, loginVo);
        return loginVo;
    }

    /**
     * 加密密码
     *
     * @param password
     * @param salt
     * @return
     */
    private String encryptPassword(String password, String salt) {
        return DigestUtils.md5DigestAsHex((DigestUtils.md5DigestAsHex((password + salt).getBytes())).getBytes());
    }

    @Override
    public User getOne(User user) {
        return userDao.getOne(user);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 批量插入
     *
     * @param user
     * @return
     */
    @Override
    public int batchInsert(List<UserDto> user) {
        return this.userDao.batchInsert(user);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userDao.deleteById(id) > 0;
    }
}