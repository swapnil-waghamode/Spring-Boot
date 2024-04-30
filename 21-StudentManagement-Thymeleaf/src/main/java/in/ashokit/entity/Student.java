package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue
	private Integer sid;
	
	@NotBlank(message = "Name should not be blank")
	@Size(min = 3, max = 15 , message = "Name should be of 3-15 charater")
	private String name;
	
	@NotBlank(message = "Gender should not be blank")
	private String gender;
	
	@NotBlank(message = "Address should not be blank")
	private String address;
}
