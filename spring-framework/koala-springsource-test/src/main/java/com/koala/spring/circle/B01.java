package com.koala.spring.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * day23
 * Create by koala on 2021-07-18
 */
@Component
public class B01 {

	private A01 a;

	/*@Autowired //事务 b.tx1();  tx(){tx1()}
	private B01 b;*/

	public B01(){
		System.out.println("B01...构造....");
	}

	@Autowired
	public void setA(A01 a) {
		this.a = a;
	}
}
