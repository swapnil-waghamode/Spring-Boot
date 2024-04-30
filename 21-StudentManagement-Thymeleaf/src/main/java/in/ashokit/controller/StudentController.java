package in.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
//	load page
    @GetMapping("/")
	public String loadStudentPage(Model model) {
    	
    	model.addAttribute("s", new Student());
    	return "index";
    	
	}
    
//    take form binding data and add to db
    
    @PostMapping("/student")
    public String addStudent(@Validated @ModelAttribute("s") Student st ,BindingResult result, Model model) {
    	
    	if(result.hasErrors()) {
    		return "index";
    	}
    	
    	
    	st = repo.save(st);
    	
    	if(st.getSid() != null) {
    		model.addAttribute("msg", "Student Added Successfully");
    	}
    	
    	return "index";
    }
    
//    show student details on page
    
    @GetMapping("/students")
    public String showStudents(Model model) {
    	
    	  List<Student> students = repo.findAll();
    	  
    	  model.addAttribute("students", students);
    	  
    	  return "student";
    	
    }
    
//    delete student records
    
    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("sid") Integer id, Model model) {
    	
    	repo.deleteById(id);
    	
    	model.addAttribute("dmsg" , "Student Deleted Successfully");
    	
    	model.addAttribute("students", repo.findAll());
    	
    	return "student";
    }
    
    
    @GetMapping("/edit")
    public String editStudent(@RequestParam("sid") Integer id, Model model) {
    	
    	Optional<Student> byId = repo.findById(id);
    	
    	if(byId.isPresent()) {
    		Student student = byId.get();
    		model.addAttribute("s", student);
    	}
    	
    	return "index";
    }
    
    
}
