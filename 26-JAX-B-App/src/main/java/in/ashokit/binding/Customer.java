package in.ashokit.binding;


import lombok.Data;

@Data
@javax.xml.bind.annotation.XmlRootElement
public class Customer {

	private Integer id;
	private String name;
	private String email;
	private Long phno;
	
}