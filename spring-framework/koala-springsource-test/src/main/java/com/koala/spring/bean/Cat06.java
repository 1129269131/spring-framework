package com.koala.spring.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * day18
 * Create by koala on 2021-07-05
 */
@Component
public class Cat06 implements InitializingBean, SmartInitializingSingleton {

	public Cat06() {
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

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("所有组件都创建完成以后，再来执行这个方法.....");
	}
}
