package com.koala.spring.config;

import com.koala.spring.bean.Person01;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * day02：@Import的使用
 * Create by koala on 2021-07-05
 */
@Configuration
public class MainConfig01 {

	@Bean
	public Person01 person(){
		Person01 person = new Person01();
		person.setName("李四");
		return person;
	}

}
