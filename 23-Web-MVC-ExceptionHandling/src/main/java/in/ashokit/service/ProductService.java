package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public String getNameById(Integer id) {
		
		int i = 10/0;
		return "Mouse";
	}
}
