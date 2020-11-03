package com.bear.springmvctest.constant;

/**
 * api返回状态码
 */

public interface ResponseCode {

    //Integer CODE_200 = 200; //获取成功
    Integer CODE_200 = 100000; //获取成功
    Integer CODE_201 = 201; //新增成功
    Integer CODE_202 = 202; //编辑成功
    Integer CODE_203 = 203; //删除成功
    Integer CODE_204 = 204; //操作成功


    Integer CODE_400 = 400;
    Integer CODE_401 = 401;
    Integer CODE_402 = 402;

    Integer CODE_500 = 500;

    Integer CODE_40001 = 40001;
    Integer CODE_40002 = 40002;


}
