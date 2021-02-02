package com.bear.springmvctest.controller.admin;

import com.bear.springmvctest.dto.GoodsSaveDto;
import com.bear.springmvctest.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/2/1 下午5:30
 * Description:
 */

@RestController
@RequestMapping("manage/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @PostMapping("insert")
    public void insert(@ModelAttribute GoodsSaveDto goodsSaveDto) {

        System.out.println(goodsSaveDto);
        goodsService.insert(goodsSaveDto);

    }
}
