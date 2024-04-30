package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	public String getWelcomeMessage(Model model) {
		
		model.addAttribute("msg", "Welcome to thymeleaf");
		
		return "index";
	}
	
	@GetMapping("/greet")
	public String getGreetMessage(Model model) {
		
		model.addAttribute("msg", "Good Evening");
		
		return "index";
	}
}
