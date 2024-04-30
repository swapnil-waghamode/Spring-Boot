package in.ashokit.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class UnMarshalDemo {

	public static void main(String[] args) throws Exception
	{
		
		File f = new File("customer.xml");
		
		JAXBContext jb = JAXBContext.newInstance(Customer.class);
		
		Unmarshaller unmarshaller = jb.createUnmarshaller();
		Object umobj = unmarshaller.unmarshal(f);
		
		Customer c = (Customer) umobj;
		
		System.out.println(c);
	}
}
