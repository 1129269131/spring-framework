package com.koala.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * day07：了解档案馆工作的过程
 * 测试：
 * 		1、给 DefaultListableBeanFactory.java 类的 registerBeanDefinition() 方法打断点
 * 		2、运行 MainTest02.java 类
 * 		3、查看idea的调用堆栈，从下往上查看它的调用过程
 * 目的：将 xml 转为 BeanDefinition.java 这个java对象
 * Create by koala on 2021-07-05
 */
public class MainTest02 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
	}

}
