package com.bear.springmvctest.service.impl;

import com.bear.springmvctest.dao.GoodsDao;
import com.bear.springmvctest.dto.GoodsSaveDto;
import com.bear.springmvctest.service.GoodsService;
import com.bear.springmvctest.vo.GoodsListVo;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.ObjectFactory;
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

    @Override
    public List<GoodsListVo> getMyGoods(Integer createId, String goodsName) {
        return goodsDao.getMyGoods(createId, goodsName);
    }

    @Override
    public List<GoodsListVo> selectMyGoods(Integer createId, String goodsName) {
        return goodsDao.getMyGoods(createId, goodsName);
    }

    @Override
    public GoodsListVo queryById(Integer id) {

        GoodsListVo goodsListVo1 = goodsDao.queryById(id);
        goodsListVo1.setGoodsName("bear");
        GoodsListVo goodsListVo2 = goodsDao.queryById(id);

        return goodsListVo2;
    }

    @Override
    public int insert(GoodsSaveDto goodsSaveDto) {
        return goodsDao.insert(goodsSaveDto);
    }
}
