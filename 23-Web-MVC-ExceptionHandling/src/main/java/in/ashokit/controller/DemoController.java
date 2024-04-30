package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {


	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msgText = "Welcome to Ashokit";

		model.addAttribute("msg", msgText);
		return "index";
	}

	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		String msgText = "Good Morning";
	    String s = null;
	    s.length();
		model.addAttribute("msg", msgText);
		return "index";
	}

}
