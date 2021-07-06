package com.koala.spring;

import com.koala.spring.bean.Person01;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * day01：源码环境搭建使用
 * Create by koala on 2021-07-05
 */
public class MainTest01 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person01 bean = context.getBean(Person01.class);
		System.out.println(bean);
	}

}
