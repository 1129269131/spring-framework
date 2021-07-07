package com.koala.spring.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * day03
 * Create by koala on 2021-07-05
 */
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Cat02 {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
