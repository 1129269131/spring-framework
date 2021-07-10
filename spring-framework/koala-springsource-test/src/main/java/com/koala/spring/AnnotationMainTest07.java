package com.koala.spring;

import com.koala.spring.bean.Person05;
import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day09：ioc容器的获取方式（使用implements ApplicationContextAware）
 * 测试：
 * 		1、给 Person05.java 类的构造器打上断点 + Person05.java 类的 setApplicationContext() 方法打上断点
 * 		2、debug运行 AnnotationMainTest07.java 类
 * 		3、查看idea的调用堆栈，从下往上查看它的调用过程
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest07 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		Person05 bean = applicationContext.getBean(Person05.class);
		ApplicationContext context = bean.getContext();

		System.out.println(context == applicationContext);
	}

}
