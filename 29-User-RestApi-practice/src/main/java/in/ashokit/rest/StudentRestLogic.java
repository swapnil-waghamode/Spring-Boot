package in.ashokit.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;

@RestController
public class StudentRestLogic {

	Map<Integer, Student> m = new HashMap<>();
	
//	inserting data
	
	@PostMapping("/student")
	public ResponseEntity<String> save(@RequestBody Student student){
		System.out.println(student);
		m.put(student.getSid(), student);
		return new ResponseEntity<String>("data saved",HttpStatus.CREATED);
	}
	
//	Getting data using request parameter
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("sid") Integer id) {
		
		Student student = m.get(id);
		return student;
	}
	
//	Getting data with path parameters
	
	
	@GetMapping("/student/{sid}/data")
	public Student getS(@PathVariable("sid") Integer id) {
		Student student = m.get(id);
		return student;
	}
	
	
	
}