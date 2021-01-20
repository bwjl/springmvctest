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


    /**
     * @param createId
     * @param goodsName
     * @return
     */
    @Select("{select * from where create_id = #{createId}} and goods_name = #{goodsName}")
    List<GoodsListVo> selectMyGoods(Integer createId, String goodsName);

    /**
     * @return
     */
    List<GoodsListVo> getList();

    /**
     * @param createId
     * @param goodsName
     * @return
     */
    List<GoodsListVo> getMyGoods(Integer createId, String goodsName);

    GoodsListVo queryById(Integer id);
}
