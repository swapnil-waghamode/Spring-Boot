package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

//		find all the classes from base package ( package and sub package)
		ac.scan("my.app");

//		refresh spring container
		ac.refresh();

//		create object
		HandlerInfo obj = ac.getBean("hob", HandlerInfo.class);

//	   print object

		System.out.println(obj);

	}
}
