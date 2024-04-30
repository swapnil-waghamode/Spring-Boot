package com.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = new  ClassPathXmlApplicationContext("config.xml");
		Object bean = ac.getBean("eobj");
		System.out.println(bean);
		ac.close();
		
	}
}
