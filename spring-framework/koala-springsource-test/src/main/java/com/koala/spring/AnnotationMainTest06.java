package com.koala.spring;

import com.koala.spring.bean.Person04;
import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day09：ioc容器的获取方式（使用@Autowired注解）
 * 测试：
 * 		1、运行 AnnotationMainTest06.java 类查看运行结果
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest06 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		Person04 bean = applicationContext.getBean(Person04.class);
		ApplicationContext context = bean.getContext();

		System.out.println(context == applicationContext);
	}

}
