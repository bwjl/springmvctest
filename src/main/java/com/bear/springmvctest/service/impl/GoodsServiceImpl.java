package com.bear.springmvctest.service.impl;

import com.bear.springmvctest.dao.GoodsDao;
import com.bear.springmvctest.service.GoodsService;
import com.bear.springmvctest.vo.GoodsListVo;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/13 上午12:08
 * Description:
 */

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsDao goodsDao;

    @Override
    public List<GoodsListVo> getList(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        return goodsDao.getList();
        //return null;
    }
}
