package com.bear.springmvctest.service;

import com.bear.springmvctest.vo.GoodsListVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/12 下午11:58
 * Description:
 */

public interface GoodsService {

    List<GoodsListVo> getList(Integer page, Integer limit);

    List<GoodsListVo> getMyGoods(Integer createId, String goodsName);

    List<GoodsListVo> selectMyGoods(Integer createId, String goodsName);

    @Transactional
    GoodsListVo queryById(Integer id);

}
