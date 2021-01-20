package com.bear.springmvctest.controller;

import com.alibaba.excel.EasyExcel;
import com.bear.springmvctest.bo.GoodsBo;
import com.bear.springmvctest.service.GoodsService;
import com.bear.springmvctest.vo.GoodsListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/19 上午9:38
 * Description:
 */

@Controller
@RequestMapping("easyExcel")
public class EasyExcelDemoController {

    @Autowired
    private GoodsService goodsService;

    /**
     * excel导出
     */
    @GetMapping("export")
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<GoodsListVo> goodsListVo = goodsService.getList(1, 10);

        List<GoodsBo> list = goodsListVo.stream().map(t -> {
            return GoodsBo.builder().goodsName(t.getGoodsName())
                    .brand(t.getBrand())
                    .barCode(t.getBarCode())
                    .category(t.getCategory())
                    .build();
        }).collect(Collectors.toList());

        String fileName = "test" + System.currentTimeMillis();

        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");

        EasyExcel.write(response.getOutputStream(), GoodsBo.class).sheet("test").doWrite(list);

        return;

    }

}
