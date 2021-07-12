package com.koala.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * day11：
 * BeanFactory的后置处理器：
 * 	测试：
 * 		1、给 com.koala.spring.processor.factory 下的所有类的 所有方法打上断点
 * 		2、debug运行 MainTest03.java 类
 * 		3、放行查看调用的方法（Resume Program）
 * 		4、查看idea的调用堆栈，从下往上查看它的调用过程
 *
 * day12：
 * Bean组件的 PostProcessor：
 * 	测试：
 * 		1、给 com.koala.spring.processor.bean 下的所有类的 所有方法打上断点
 * 		2、debug运行 MainTest03.java 类
 * 		3、放行查看调用的方法（Resume Program）
 * 		4、查看idea的调用堆栈，从下往上查看它的调用过程
 *
 * day13：
 * 后置处理器干预生命周期的过程--对象创建之前：
 * 	测试：
 * 		1、给 com.koala.spring.processor.bean 下的所有类的 所有重写的方法打上断点
 * 		2、给 Cat05.java 类的构造器、afterPropertiesSet()方法打上断点
 * 		3、debug运行 MainTest03.java 类
 * 		4、放行查看调用的方法（Resume Program）
 * 		5、查看idea的调用堆栈，从下往上查看它的调用过程
 * 	PS：ioc容器要挨个创建所有组件，在组件创建过程中会有各种后置增强器增强组件的功能，以完成Spring底层里边各种厉害的特效
 * Create by koala on 2021-07-05
 */
public class MainTest03 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
	}

}
