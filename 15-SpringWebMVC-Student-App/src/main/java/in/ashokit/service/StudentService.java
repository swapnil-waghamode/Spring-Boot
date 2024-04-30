package in.ashokit.service;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Student;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	
	public boolean saveStudent(Student student) {
		
		StudentEntity entity = new  StudentEntity();
		
//		copying data from binding class to entity 
		BeanUtils.copyProperties(student, entity);
		
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		repo.save(entity);
		
		return true;
	}

	public List<String> getCourses(){
		return Arrays.asList("Java", "Python", "AWS","DevOps");
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}
}
