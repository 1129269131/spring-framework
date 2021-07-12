package com.koala.spring.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * day11
 * Create by koala on 2021-07-05
 */
public class Cat05 implements InitializingBean {

	public Cat05() {
		System.out.println("cat05被创建了...");
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("cat..afterPropertiesSet...");
	}
}
