package com.koala.spring;

import com.koala.spring.bean.Person01;
import com.koala.spring.config.MainConfig01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day02：注解版Spring的用法
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest01 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig01.class);
		Person01 bean = applicationContext.getBean(Person01.class);
		System.out.println(bean);
	}

}
