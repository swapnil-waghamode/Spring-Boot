package com.myapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myapp.MyAppConfig;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext sc = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Object bean = sc.getBean("con");
		System.out.println(bean);
	}

}
