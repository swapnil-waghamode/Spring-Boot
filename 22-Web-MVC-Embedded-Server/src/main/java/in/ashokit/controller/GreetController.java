package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greet")
 class GreetController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String message() {
		
		String msg = "Hello there , How are you ?";
		
		return msg;
	}

}
