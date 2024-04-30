package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/message")
public class MessageController {

	@GetMapping("/")
	public String greet(Model model) {
		
		model.addAttribute("msg", "Good Morning");
		return "index";
	}
	
//	direct response to client
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		String msg = "Hello Everyone";
		
		return msg;
	}
}
