package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.service.GoodsService;
import com.bear.springmvctest.util.ApiResultUtil;
import com.bear.springmvctest.vo.GoodsListVo;
import com.github.pagehelper.PageHelper;
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
public class YcgGoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping("manage/goods/getList")
    public Object getList(@RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        List<GoodsListVo> goodsListVo = goodsService.getList(page, limit);
        return ApiResultUtil.okList(goodsListVo);
    }
}
