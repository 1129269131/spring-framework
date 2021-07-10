package com.koala.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * day09：ioc容器的获取方式（使用@Autowired注解）
 * Create by koala on 2021-07-05
 */
@Component
public class Person04 {

	@Autowired
	ApplicationContext context;  //可以要到ioc容器

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}
}
