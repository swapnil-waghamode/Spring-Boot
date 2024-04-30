package in.ashokit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SendEmailApp implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message : App started");
		
	}

}
