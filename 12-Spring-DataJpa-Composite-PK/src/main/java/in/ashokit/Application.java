package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPk;
import in.ashokit.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountRepo repo = context.getBean(AccountRepo.class);

		AccountPk apk = new AccountPk();
		apk.setAccountNumber(138362283);
		apk.setAccountType("savings");

		Account a = new Account();
		a.setHolderName("Vendor");
		a.setBranch("Bengaluru");
		a.setAccPk(apk);

		repo.save(a);

//		getting data
//		AccountPk apk = new AccountPk();
//		apk.setAccountNumber(138362283);
//		apk.setAccountType("savings");
//
//		Optional<Account> byId = repo.findById(apk);
//
//		if (byId.isPresent()) {
//			System.out.println(byId.get());
//		}

	}

}
