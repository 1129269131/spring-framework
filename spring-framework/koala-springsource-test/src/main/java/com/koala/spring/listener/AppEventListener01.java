package com.koala.spring.listener;

import com.koala.spring.circle.A01;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * day29：
 * 事件监听器；为什么一个注解就能监听来事件。。。。。
 * DataSource。TransationManager（切面） === DBService
 * @EnableTransationManager
 * Create by koala on 2021-07-22
 */
@Component
public class AppEventListener01 {

	public AppEventListener01(){
		System.out.println("AppEventListener...");
	}

	@EventListener(MessageEvent01.class) //day29：监听事件
	public void listenMessage(MessageEvent01 event){
		System.out.println("Message事件到达..."+event+"；已发送邮件....");
	}


	@EventListener(ChangeEvent01.class)
	public void listenChange(ChangeEvent01 event){
		System.out.println("Change事件到达..."+event+"；已同步状态....");
	}

	@EventListener(PayloadApplicationEvent.class) //day29：感知任意对象事件的
	public void listenPayload(PayloadApplicationEvent<A01> event){
		System.out.println("Payload事件到达..."+event.getPayload()+"；已进行处理....");
	}

}
