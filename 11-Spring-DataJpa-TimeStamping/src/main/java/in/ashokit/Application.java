package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmpRepo repo = context.getBean(EmpRepo.class);
		
		Employee e = new Employee();
		e.setEmpId(102);
		e.setEmpName("Tulsi");
		e.setEmpGender("Female");
		e.setDept("TeamLead");
		
		repo.save(e);
		
		
		
	}

}
