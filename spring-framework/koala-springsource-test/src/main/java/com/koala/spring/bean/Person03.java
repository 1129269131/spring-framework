package com.koala.spring.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * day04：@Lookup的使用
 * 		说明：单例组件依赖非单例组件，非单例组件获取需要使用方法
 * Create by koala on 2021-07-05
 */
@Component
public class Person03 {
	private String name;

	//@Autowired  依赖的组件是多实例就不能使用@Autowired注解
	private Cat02 cat;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Lookup  //去容器中找。	如果是@Bean的这种方式注册的Person，则@Lookup不生效
	public Cat02 getCat() {
		return cat;
	}

	public void setCat(Cat02 cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "Person03{" +
				"name='" + name + '\'' +
				'}';
	}
}
