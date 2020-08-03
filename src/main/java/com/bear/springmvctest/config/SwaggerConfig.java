package com.bear.springmvctest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/3 上午11:07
 * Description: swagger2 配置
 */

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("bear", "http://www.alibaba.com", "bear@alibaba-inc.com");
        return new ApiInfoBuilder()
                .title("后台管理系统API接口")
                .description("后台管理系统API接口")
                .contact(contact)
                .version("1.0.0")
                .build();
    }
}
