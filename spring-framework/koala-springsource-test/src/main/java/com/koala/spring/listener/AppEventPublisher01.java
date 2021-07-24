package com.koala.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * day29：事件发布器
 * Create by koala on 2021-07-22
 */
@Component
public class AppEventPublisher01 implements ApplicationEventPublisherAware {

	ApplicationEventPublisher eventPublisher;
	public AppEventPublisher01(){
		System.out.println("AppEventPublisher....");
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.eventPublisher = applicationEventPublisher;
	}

	public void publish(ApplicationEvent applicationEvent){
		eventPublisher.publishEvent(applicationEvent);
	}

	public void publish(Object o){
		eventPublisher.publishEvent(o);
	}

}
