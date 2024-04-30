package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ashokit.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public String productName(Model model) {
		
		String name = service.getNameById(100);
		model.addAttribute("pmsg" , name);
		
		return "index";
	}
}
