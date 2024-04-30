package in.ashokit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

//@Component
public class Motor implements InitializingBean, DisposableBean{

	public Motor() {
		System.out.println("Motor :: constructor");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet( ) called ");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method called ");
	}

}
