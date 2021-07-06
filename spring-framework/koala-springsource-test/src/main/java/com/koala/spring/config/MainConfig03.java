package com.koala.spring.config;

import com.koala.spring.bean.Cat01;
import com.koala.spring.bean.Person01;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * day02：@Import的使用
 * Create by koala on 2021-07-05
 */
@Import({ MainConfig03.MyImportRegistrar.class })//点击进入 @Import 注解类中，查看注解使用说明
@Configuration
public class MainConfig03 {

	/**
	 * 	BeanDefinitionRegistry：Bean定义信息注册中心：图纸中心;
	 * 				它里面都是BeanDefinition
	 *
	 * 	<bean class="com.atguigu.spring.bean.Person" id="person">
	 * 		<property name="name" value="张三"/>
	 * 	</bean>
	 * 	 对应
	 * 	RootBeanDefinition
	 *
	 */
	static class MyImportRegistrar implements ImportBeanDefinitionRegistrar {
		@Override
		public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
											BeanDefinitionRegistry registry) {
			// BeanDefinition
			RootBeanDefinition catDefinition = new RootBeanDefinition();
			catDefinition.setBeanClass(Cat01.class);
			//可以声明定义信息，包括需要自动装配什么？

			//Spring 这个实例的类型，名字
			registry.registerBeanDefinition("tomCat",catDefinition);
		}
	}

}
