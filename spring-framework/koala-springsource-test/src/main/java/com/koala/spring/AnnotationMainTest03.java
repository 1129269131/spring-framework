package com.koala.spring;

import com.koala.spring.config.MainConfig03;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day02：注解版Spring的用法
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest03 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig03.class);

		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}

}
