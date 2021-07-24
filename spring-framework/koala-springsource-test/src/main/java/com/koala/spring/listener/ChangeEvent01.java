package com.koala.spring.listener;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * day29：事件需要实现序列化接口
 * Create by koala on 2021-07-22
 */
public class ChangeEvent01 extends ApplicationEvent implements Serializable {

	private static final long serialVersionUID = 0L;
	private String state;
	private ChangeEvent01(Object source) {
		super(source);
	}

	public ChangeEvent01(Object source,String state){
		super(source);
		this.state = state;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "ChangeEvent{" +
				"state='" + state + '\'' +
				", source=" + source +
				'}';
	}

}
