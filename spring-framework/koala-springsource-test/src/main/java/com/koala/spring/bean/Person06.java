package com.koala.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * day10
 */
@Component
public class Person06 {

	private Cat04 cat;

	public Person06(){
		System.out.println("person创建....");//打断点测试
	}

	@Autowired
	public void setCat(Cat04 cat) {
		this.cat = cat;//打断点测试
	}

	public Cat04 getCat() {
		return cat;
	}

}
