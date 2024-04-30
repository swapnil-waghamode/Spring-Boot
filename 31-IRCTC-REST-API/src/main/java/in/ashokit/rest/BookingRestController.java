package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.Passanger;
import in.ashokit.response.Ticket;
import in.ashokit.service.BookingService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/bookings")
@Tag(name = "TicketControllers", description = "APIs for Ticket Booking")
public class BookingRestController {

	@Autowired
	private BookingService service;

//	method to book ticket (POST)

	@PostMapping(value = "/ticket", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger) {
		Ticket ticket = service.bookTicket(passanger);

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}

//	method to get ticket (GET)

	@GetMapping(value = "/ticket/{ticketNumber}", produces = "application/json")
	public Ticket getTicket(@PathVariable("ticketNumber") Integer ticketNumber) {
		return service.getTicket(ticketNumber);
	}

}
