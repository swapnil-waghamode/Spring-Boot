package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "emp")
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private String empGender;
	private String dept;
	
	@CreationTimestamp
	@Column(name="date_created" , updatable = false)
	private LocalDate dateCreated;
	
	@UpdateTimestamp
	@Column(name = "last_updated" , insertable = false)
	private LocalDate lastUpdated;
}
