package com.koala.spring;

import com.koala.spring.bean.Cat02;
import com.koala.spring.bean.Person02;
import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day03：@Scope的使用
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest04 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		Cat02 bean1 = applicationContext.getBean(Cat02.class);
		Cat02 bean2 = applicationContext.getBean(Cat02.class);

		System.out.println(bean1 == bean2);  //false

		System.out.println("-----------------------------");

		Person02 bean3 = applicationContext.getBean(Person02.class);
		Cat02 cat1 = bean3.getCat();

		Person02 bean4 = applicationContext.getBean(Person02.class);
		Cat02 cat2 = bean4.getCat();

		System.out.println(cat1 == cat2);  //true
	}

}
