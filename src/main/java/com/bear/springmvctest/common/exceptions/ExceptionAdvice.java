package com.bear.springmvctest.common.exceptions;

import com.bear.springmvctest.constant.ResponseCode;
import com.bear.springmvctest.util.ApiResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/1 上午10:22
 * Description:
 */

@ControllerAdvice
@ResponseBody
public class ExceptionAdvice {


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

        return ApiResultUtil.fail(ResponseCode.CODE_400, resultList.get(0));
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public Object handleValidationException(ConstraintViolationException e) {
        List<String> resultList = new ArrayList<>();
        for (ConstraintViolation<?> s : e.getConstraintViolations()) {
            resultList.add(s.getInvalidValue() + ": " + s.getMessage());
        }
        return ApiResultUtil.fail(ResponseCode.CODE_400, resultList.get(0));
    }
}
