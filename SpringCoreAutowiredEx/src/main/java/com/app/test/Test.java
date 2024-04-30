package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyAppConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object serv = ac.getBean("myService");
		System.out.println(serv);
	}
}
