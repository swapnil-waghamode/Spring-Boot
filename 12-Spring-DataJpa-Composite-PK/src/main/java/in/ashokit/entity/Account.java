package in.ashokit.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Account {

	private String holderName;
	
	private String branch;
	
	@EmbeddedId
	private AccountPk accPk;
	
}
