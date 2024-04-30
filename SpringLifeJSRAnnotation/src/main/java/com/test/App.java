package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);

		Object bean = ac.getBean("eobj");
		System.out.println(bean);
		ac.close();

	}
}
