package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerClass {

	private Logger logger = LoggerFactory.getLogger(HandlerClass.class);

//	this method will execute when NullPointerException
	@ExceptionHandler(value = NullPointerException.class)
	public String handleAE( NullPointerException ae) {
		String message = ae.getMessage();
		logger.error(message);
		return "errorpage";
	}
	
	
	
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception ae) {
		String message = ae.getMessage();
		logger.error(message);
		return "errorpage";
	}
}
