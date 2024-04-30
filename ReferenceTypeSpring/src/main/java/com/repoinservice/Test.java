package com.repoinservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");

		Service service = (Service) ac.getBean("sob");
		System.out.println(service);
	}
}
