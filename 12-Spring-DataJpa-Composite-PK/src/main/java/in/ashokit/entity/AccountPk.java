package in.ashokit.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable {

	private Integer accountNumber;
	
	private String accountType;
}
