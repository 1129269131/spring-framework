package com.koala.spring.listener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * day29：事件需要实现序列化接口
 * Create by koala on 2021-07-22
 */
public class MessageEvent01 extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = 0L;

	public MessageEvent01(String source) {
		super(source);
	}

	@Override
	public String toString() {
		return "MessageEvent{" +
				", source=" + source +
				'}';
	}
}
