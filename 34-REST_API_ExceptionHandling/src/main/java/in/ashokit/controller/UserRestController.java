package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.error.UserDefinedException;

@RestController
public class UserRestController {

	@GetMapping("/user/{userid}")
	public String getUserName(@PathVariable("userid")Integer id) throws Exception {
		
		if(id == 100) {
			return "John";
		}else if(id == 200) {
			return "Cena";
		}
		else {
			throw new UserDefinedException("User Not Found");
		}
	}
}
