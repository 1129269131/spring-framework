package com.koala.spring.config;

import com.koala.spring.bean.Person01;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * day02：@Import的使用
 * Create by koala on 2021-07-05
 */
@Import({ Person01.class})//点击进入 @Import 注解类中，查看注解使用说明
@Configuration
public class MainConfig02 {

}
