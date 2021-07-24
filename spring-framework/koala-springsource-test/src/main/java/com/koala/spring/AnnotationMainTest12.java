package com.koala.spring;

import com.koala.spring.circle.A01;
import com.koala.spring.config.MainConfig04;
import com.koala.spring.listener.AppEventPublisher01;
import com.koala.spring.listener.ChangeEvent01;
import com.koala.spring.listener.MessageEvent01;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create by koala on 2021-07-05
 */
public class AnnotationMainTest12 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig04.class);

		//测试事件
		AppEventPublisher01 eventPublisher = applicationContext.getBean(AppEventPublisher01.class);
		eventPublisher.publish(new A01());
		eventPublisher.publish(new MessageEvent01("hello，你好"));
		eventPublisher.publish(new ChangeEvent01(eventPublisher,"sending..."));
	}

}
