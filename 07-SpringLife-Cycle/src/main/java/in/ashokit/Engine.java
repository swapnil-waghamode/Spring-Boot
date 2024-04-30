package in.ashokit;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {

	@PostConstruct
	private void init() {
		System.out.println("init( ) called ");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("destroy( ) called ");
	}
}
