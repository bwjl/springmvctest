package com.bear.springmvctest.dao;

import com.bear.springmvctest.vo.GoodsListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/14 下午9:55
 * Description:
 */

public interface GoodsDao {

    List<GoodsListVo> getList();

    List<GoodsListVo> getMyGoods(@Param("createId") Integer createId, @Param("goodsName") String goodsName);
}
