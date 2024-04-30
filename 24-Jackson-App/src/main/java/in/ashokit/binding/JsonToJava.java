package in.ashokit.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws Exception
	{
		File f = new File("customer.json");
		
		ObjectMapper om = new ObjectMapper();
		
		Customer c = om.readValue(f, Customer.class);
		
		System.out.println(c);
	}
}