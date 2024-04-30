package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
	
		Object cache = ac.getBean("cob");
		System.out.println(cache);
		
		Object viewResolve = ac.getBean("vr");
		System.out.println(viewResolve);
		
	}
}
