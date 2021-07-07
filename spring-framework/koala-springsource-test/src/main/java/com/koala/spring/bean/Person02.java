package com.koala.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * day03
 * Create by koala on 2021-07-05
 */
@Component
public class Person02 {
	private String name;

	@Autowired
	private Cat02 cat;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat02 getCat() {
		return cat;
	}

	public void setCat(Cat02 cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person02{" +
				"name='" + name + '\'' +
				'}';
	}
}
