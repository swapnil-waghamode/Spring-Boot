package in.ashokit.error;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = UserDefinedException.class)
	public ResponseEntity<ErrorInfo> handleUserNotF(UserDefinedException e){
		String msg = e.getMessage();
		
		ErrorInfo eInfo = new ErrorInfo();
		eInfo.setCode("SBIEX001");
		eInfo.setMsg(msg);
		eInfo.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(eInfo, HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> getErrorInfo(Exception e){
		String msg = e.getMessage();
		
		ErrorInfo eInfo = new ErrorInfo();
		eInfo.setCode("SBIEX003");
		eInfo.setMsg(msg);
		eInfo.setWhen(LocalDateTime.now());
		
		return new ResponseEntity<ErrorInfo>(eInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
