package com.bear.springmvctest.config;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/9/11 下午4:00
 * Description:
 */

@Configuration
public class JackSonConfig {

//    @Bean
//    public Jackson2ObjectMapperBuilder jacksonBuilder() {
//        Jackson2ObjectMapperBuilder b = new Jackson2ObjectMapperBuilder();
//        b.propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
//        return b;
//    }

}
