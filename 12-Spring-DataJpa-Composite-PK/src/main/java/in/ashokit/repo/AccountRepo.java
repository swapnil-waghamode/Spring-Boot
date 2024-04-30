package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Account;
import in.ashokit.entity.AccountPk;

public interface AccountRepo  extends JpaRepository<Account,AccountPk >{

}
