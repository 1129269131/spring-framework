package com.koala.spring;

import com.koala.spring.bean.Hello01;
import com.koala.spring.bean.Person06;
import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day14：工厂bean独有的初始化方式
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest09 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		Hello01 bean1 = applicationContext.getBean(Hello01.class);
		Hello01 bean2 = applicationContext.getBean(Hello01.class);

		System.out.println(bean1 == bean2);//true 工厂bean还是单例
	}

}
