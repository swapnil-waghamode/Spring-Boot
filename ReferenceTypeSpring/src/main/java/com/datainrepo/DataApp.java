package com.datainrepo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		DataRepo d = (DataRepo)context.getBean("rep");
		System.out.println(d);
	}
}
