package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	ProductRepo repo;

	@GetMapping("/")
	public String loadPage(Model model) {

		model.addAttribute("p", new Product());

		return "index";

	}

	@PostMapping("/product")
	public String addProduct(@ModelAttribute("p") Product p, Model model) {

		p = repo.save(p);
		if (p.getPid() != null) {
			model.addAttribute("msg", "Product Saved Successfully");
		}

		return "index";
	}

	@GetMapping("/products")
	public String loadProducts(Model model) {

		model.addAttribute("products", repo.findAll());

		return "data";
	}

}
