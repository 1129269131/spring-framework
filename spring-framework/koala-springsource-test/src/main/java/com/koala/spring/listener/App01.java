package com.koala.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * day29：容器中会拿到所有的事件监听器，挨个遍历调用 onApplicationEvent
 * Create by koala on 2021-07-22
 */
@Component
public class App01 implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("");
	}

}
