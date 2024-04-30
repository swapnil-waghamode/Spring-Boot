package in.ashokit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@GetMapping("/")
	public Customer getCustomer() {
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("r@gmail.com");
		c.setPhno(19382823l);
		
		return c;
	}
}
