package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.service.GoodsService;
import com.bear.springmvctest.util.ApiResultUtil;
import com.bear.springmvctest.vo.GoodsListVo;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/12 下午11:55
 * Description:
 */

@RestController
@RequestMapping("ycgj")
@Api("商品")
public class YcgGoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("manage/goods/getMyGoods")
    public Object getMyGoods(@RequestParam("create_id") Integer createId, @RequestParam("goods_name") String goodsName) {
        List<GoodsListVo> goodsListVo = goodsService.getMyGoods(createId, goodsName);
        return ApiResultUtil.okList(goodsListVo);
    }


    @GetMapping("manage/goods/getList")
    @ApiOperation("商品列表")
    public Object getList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        List<GoodsListVo> goodsListVo = goodsService.getList(page, limit);
        return ApiResultUtil.okList(goodsListVo);
    }
}
