package com.bear.springmvctest.controller.ycgj;

import com.bear.springmvctest.util.ApiResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/1 上午10:22
 * Description:
 */

@ResponseBody
@ControllerAdvice
public class ExceptionAdvice {

//    ExceptionAdvice()
//    {
//        System.out.println("ExceptionAdvice");
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        //logger.error("参数验证失败", e);
        System.out.println("参数验证失败");
        BindingResult result = e.getBindingResult();
        List<String> resultList = new ArrayList<String>();
        for (ObjectError error : result.getAllErrors()) {
            String code = error.getCode();
            String message = error.getDefaultMessage();
            String description = String.format("%s:%s", code, message);
            resultList.add(message);
        }
//        return new CommonResult().failure(resultList, ResultStatusEnum.PARAMETER_INVALID.getCode(),
//                ResultStatusEnum.PARAMETER_INVALID.getDescription()).toJSON();
        return ApiResultUtil.fail();
    }
}
