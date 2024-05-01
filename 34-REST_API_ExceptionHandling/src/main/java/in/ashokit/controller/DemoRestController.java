package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/greet")
	public String getWelcomeMessage() {
		
		int i = 10/0;
		return "Welcome to REST API";
		
		
	}
}
