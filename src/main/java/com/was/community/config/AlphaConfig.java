package com.was.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @Auther: wasx
 * @Date: 2022/4/26 - 04 - 26 - 10:41
 * @Description: com.was.community.config
 * @version: 1.0
 */

@Configuration
public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
