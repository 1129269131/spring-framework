package com.koala.spring;

import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day19：容器刷新的十二大步
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest10 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);
	}

}
