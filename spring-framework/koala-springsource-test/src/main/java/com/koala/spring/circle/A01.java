package com.koala.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * day23
 * Create by koala on 2021-07-18
 */
@Component
public class A01 {
	private B01 b;

	public A01(){
		System.out.println("A01...构造....");
	}

	@Autowired
	public void setB(B01 b) {
		this.b = b;
	}
}
