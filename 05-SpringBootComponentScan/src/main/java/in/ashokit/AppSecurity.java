package in.ashokit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppSecurity {

	public AppSecurity() {
		System.out.println("App Security constructor");
	}
	
	@Bean
	AppSecurity getSecured() {
		AppSecurity as = new AppSecurity();
		return as;
	}

}
