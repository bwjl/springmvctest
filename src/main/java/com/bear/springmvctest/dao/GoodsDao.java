package com.bear.springmvctest.dao;

import com.bear.springmvctest.entity.Goods;
import com.bear.springmvctest.vo.GoodsListVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/14 下午9:55
 * Description:
 */

public interface GoodsDao {

    //select 参数不需要@Param 注解
    @Select("{select * from where create_id = #{createId}} and goods_name = #{goodsName}")
    List<GoodsListVo> selectMyGoods(Integer createId, String goodsName);

    List<GoodsListVo> getList();

    //List<GoodsListVo> getMyGoods(@Param("createId") Integer createId, @Param("goodsName") String goodsName);
    List<GoodsListVo> getMyGoods(Integer createId, String goodsName);

    GoodsListVo queryById(Integer id);
}
