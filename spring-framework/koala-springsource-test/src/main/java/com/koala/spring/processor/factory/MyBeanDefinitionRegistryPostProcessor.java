package com.koala.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * day11：BeanFactory的后置处理器 , 可以通过实现 PriorityOrdered、Ordered 接口方式实现排序功能
 * Create by koala on 2021-07-11
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public MyBeanDefinitionRegistryPostProcessor(){
		System.out.println("MyBeanDefinitionRegistryPostProcessor");
	}

	@Override  //day11：紧接着执行
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor....postProcessBeanFactory...");
	}

	@Override  //day11：先执行的
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyBeanDefinitionRegistryPostProcessor...postProcessBeanDefinitionRegistry...");
		//day11：增强bean定义信息的注册中心，比如自己注册组件
	}

}
