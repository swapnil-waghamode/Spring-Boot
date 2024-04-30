package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Nature;
import in.ashokit.repo.NatureRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	    NatureRepo repo = context.getBean(NatureRepo.class);
		System.out.println(repo.getClass().getName());
		
//		insert
		/*
		 * Nature n = new Nature(1, "food", "Benagaluru", "BTM");
		 * repo.insertData(n.getNatureId(), n.getChain(), n.getCity(), n.getAreaName());
		 */
		
//		update
		
		/*
		 * Nature n = new Nature(); n.setChain("global"); n.setCity("Belagavi");
		 * n.setAreaName("Niapni");
		 * 
		 * repo.updateData(1, n.getChain(), n.getCity(), n.getAreaName());
		 */
		
//		delete operation
		
		
		repo.deleteData(1);
		
	}

}
