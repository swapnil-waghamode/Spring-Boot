package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	
	@PostMapping("/msg")
	public ResponseEntity<String> message() {

		String responseBody = "Message saved successfully";
		
//		Our own status code 
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}

	@GetMapping("/welcome")
	public String getMessage() {
		String msg = "Welcome to REST API";

		return msg;
	}

	@GetMapping("/greet")
	public String greetMessage() {

		String msg = "Hello! REST";

		return msg;
	}
}