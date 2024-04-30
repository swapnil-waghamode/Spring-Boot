package in.ashokit.binding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws Exception {
		
		Address a = new Address();
		a.setCity("Bengaluru");
		a.setState("Karnataka");
		a.setCountry("India");
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("r@gmail.com");
		c.setPhno(19382823l);
		c.setAddr(a);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		
		
		System.out.println("Json file created");
	}
}
