package com.koala.spring.bean;

/**
 * day01
 * Create by koala on 2021-07-05
 */
public class Person01 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person01{" +
				"name='" + name + '\'' +
				'}';
	}
}
