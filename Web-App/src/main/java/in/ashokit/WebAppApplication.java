package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebAppApplication.class, args);
		System.out.println("Beans Loaded :"+ context.getBeanDefinitionCount());
	}

	@GetMapping("/")
	public String welcomeMessage() {
		return "<h1>Welcome to Spring boot </h1>";
	}
}
