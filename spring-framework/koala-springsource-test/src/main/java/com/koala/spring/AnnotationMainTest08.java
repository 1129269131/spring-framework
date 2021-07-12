package com.koala.spring;

import com.koala.spring.bean.Person06;
import com.koala.spring.config.MainConfig04;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * day10：后置增强机制&@Autowired是怎么完成的
 * 测试：
 * 一、后置增强机制&@Autowired是怎么完成的
 * 		1、给 DefaultListableBeanFactory.java 类的 preInstantiateSingletons() 方法下面的 RootBeanDefinition bd = getMergedLocalBeanDefinition(beanName); 打上断点
 * 		2、可以在断点上右键 --》Condition: 处输入 --》例如：beanName.equals("person06") 那么只有符合条件的断点才能进来
 * 		3、给 Person06.java 类的 //打断点测试 处打上断点
 * 		4、debug运行 AnnotationMainTest08.java 类
 * 		5、查看idea的调用堆栈，从下往上查看它的调用过程
 * 	PS：核心--》AutowiredAnnotationBeanPostProcessor.java（完成基于注解的自动装配功能）
 *
 * 二、是否是FactoryBean
 * 		1、给 DefaultListableBeanFactory.java 类的 preInstantiateSingletons() 方法下面的 if (isFactoryBean(beanName)) 打上断点
 * 		2、debug运行 AnnotationMainTest08.java 类
 * 		3、当为 HelloFactory01.java 类进行bean的创建时， if (isFactoryBean(beanName)) 的计算结果为true
 * 		4、查看idea的调用堆栈，从下往上查看它的调用过程
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest08 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		Person06 bean = applicationContext.getBean(Person06.class);
	}

}
