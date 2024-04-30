package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MotorApp {

	public static void main(String[] args) {
		   ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		   Motor bean = ac.getBean("motor", Motor.class);
	}
}
