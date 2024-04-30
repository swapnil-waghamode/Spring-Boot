package in.ashokit;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		System.out.println(repo.getClass().getName());
		
//		sorting data by name
		
//		Sort ascending = Sort.by("empName").ascending();
		
//		sorting with multiple values
		
//		Sort descending = Sort.by("empName", "empSalary").descending();
//
//		List<Employee> all = repo.findAll(descending);
//		all.forEach(System.out::println);
		
//		pagination
		
		/*
		 * int pageNo = 3;
		 * 
		 * PageRequest page = PageRequest.of(pageNo-1, 2); Page<Employee> all =
		 * repo.findAll(page); List<Employee> content = all.getContent();
		 * content.forEach(System.out::println);
		 */
		
//		QueryByExample
		
		/*
		 * Employee e = new Employee(); e.setEmpGender("Male"); e.setDept("Sales");
		 * 
		 * Example<Employee> emp = Example.of(e);
		 * 
		 * List<Employee> all = repo.findAll(emp); all.forEach(System.out::println);
		 */
		
//		Time stamp
		
	
		
	}

}
