package com.koala.spring;

import com.koala.spring.aop.HelloService01;
import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest11 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		//循环引用,原理测试
		//AOP,原理测试
		HelloService01 helloService = applicationContext.getBean(HelloService01.class);

		//代理对象来调用方法
		helloService.sayHello("zhangsan");
	}

}
