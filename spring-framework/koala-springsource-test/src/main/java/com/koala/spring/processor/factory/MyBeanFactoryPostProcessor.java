package com.koala.spring.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * day11：BeanFactory的后置处理器
 * Create by koala on 2021-07-11
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor(){
		System.out.println("MyBeanFactoryPostProcessor...");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor....postProcessBeanFactory==>"+beanFactory);
	}

}
