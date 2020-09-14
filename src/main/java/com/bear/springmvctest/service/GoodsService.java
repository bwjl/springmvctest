package com.bear.springmvctest.service;

import com.bear.springmvctest.vo.GoodsListVo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/12 下午11:58
 * Description:
 */

public interface GoodsService {

    List<GoodsListVo> getList(Integer page, Integer limit);

}
