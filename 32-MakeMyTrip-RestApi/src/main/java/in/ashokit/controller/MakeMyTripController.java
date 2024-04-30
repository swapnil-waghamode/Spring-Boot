package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.request.Passanger;
import in.ashokit.response.Ticket;
import in.ashokit.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;
	
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}

	
	
	@GetMapping("/get-ticket")
	public String getTicketNumber(@RequestParam("ticketNumber")Integer ticketNumber , Model model) {
		
		Ticket ticketByNum = service.getTicket(ticketNumber);
		model.addAttribute("ticket", ticketByNum);
		return "ticket-form";
	}
	
	//------------------------------------------------------------------------------
	
	@GetMapping("/")
	public String loadForm(Model model) {

		model.addAttribute("passanger", new Passanger());
		return "index";
	}
	
	
    @PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute("passanger") Passanger passanger, Model model) {

//		service layer
		
		Ticket ticket = service.bookTicket(passanger);
		model.addAttribute("msg", "Your ticket booked with id :"+ ticket.getTicketNumber());

		return "index";
	}

}
