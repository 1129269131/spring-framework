package com.koala.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * day09：ioc容器的获取方式（使用implements ApplicationContextAware）
 * 	Aware接口；帮我们装配Spring底层的一些组件
 * 		1、Bean的功能增强全部都是由 BeanPostProcessor+InitializingBean 合起来完成的
 * Create by koala on 2021-07-05
 */
@Component
public class Person05 implements ApplicationContextAware {

	ApplicationContext context;  //可以要到ioc容器

	public Person05(){
		System.out.println("person创建....");//打断点测试
	}

	public ApplicationContext getContext() {
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//利用回调机制，把ioc容器传入
		this.context = applicationContext;//打断点测试
	}
}
