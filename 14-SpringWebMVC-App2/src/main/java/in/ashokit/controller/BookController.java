package in.ashokit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepo;

@Controller
public class BookController {

	@Autowired
	private BookRepo bRepo;
	
//	@GetMapping("/book")
//	public ModelAndView getBookById(@RequestParam("id") Integer id) {
//		
//		ModelAndView mav = new ModelAndView();
//	
//		Optional<Book> bId = bRepo.findById(id);
//		
//		if(bId.isPresent()) {
//			Book bookObj = bId.get();
//			mav.addObject("book", bookObj);
//		}
//		
////		setting view page 
//		mav.setViewName("index");
//		
//		return mav;
//	}
	
//	We can write above method in another way
	
	@GetMapping("/book")
	public String getBookById(@RequestParam("id")Integer id, Model model) {
		
		Optional<Book> byId = bRepo.findById(id);
		
		if(byId.isPresent()) {
			Book book = byId.get();
			model.addAttribute("book",book);
		}
		
		return "index";
	}
	
	
}
