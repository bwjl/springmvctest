package com.bear.springmvctest.controller.common;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/6/25 下午7:26
 * Description:
 */

@Controller
@RequestMapping("upload")
public class UploadController {

//    public final static String IMAGE_UPLOAD_PATH = "/Users/bear/IdeaProjects/springmvctest/src/main/resources/images/"
//            + new SimpleDateFormat("yyyyMM/dd/").format(new Date()).toString();

    @Autowired
    private ServletContext servletContext;

    @GetMapping("index")
    public String index() {
        return "common/index";
    }

    @PostMapping("image")
    public String image(@RequestParam(value = "image") MultipartFile image) {

        try {
            //上传图片
            String fileName = image.getOriginalFilename();
            String imgtype = fileName.substring(fileName.lastIndexOf("."));

            //时间戳文件名称
            //String newFileName = String.valueOf(System.currentTimeMillis()) + imgtype; //String.valueOf
            String IMAGE_UPLOAD_PATH = servletContext.getRealPath("/") + "/WEB-INF/static/image/"
                    + new SimpleDateFormat("yyyyMM/dd/").format(new Date()).toString();

            String newFileName = UUID.randomUUID().toString().replace("-", "") + imgtype; //String.valueOf
            File file = new File(IMAGE_UPLOAD_PATH + newFileName);
            FileUtils.writeByteArrayToFile(file, image.getBytes());


        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:tips/fail"; //上传失败

        }

        return "redirect:tips/success"; //上传成功
    }
}
