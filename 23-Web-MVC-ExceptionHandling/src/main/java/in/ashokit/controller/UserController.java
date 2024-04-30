package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

//	local exception handling
	
	@GetMapping("/user")
	public String getWishMsg(Model model) {
		String msgText = "Good Morning";
	    int i = 10/0;
		model.addAttribute("msg", msgText);
		return "index";
	}
	

}
