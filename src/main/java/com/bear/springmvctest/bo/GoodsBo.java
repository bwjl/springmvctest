package com.bear.springmvctest.bo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2021/1/19 上午9:44
 * Description:
 */

@Data
@Builder
public class GoodsBo implements Serializable {

    @ExcelProperty(value = "烟草条码")
    private String barCode;

    @ExcelProperty(value = "品名")
    private String goodsName;

    @ExcelProperty(value = "品牌")
    private String brand;

    @ExcelProperty(value = "品类")
    private String category;


}
