package com.bear.springmvctest.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/7/5 下午11:00
 * Description: 调度任务
 */

@Controller
public class TaskController {

    @Scheduled(cron = "0/5 * * * * ?") //每隔5S执行一次
    public void index() {
        System.out.println("cron success");

    }

}
