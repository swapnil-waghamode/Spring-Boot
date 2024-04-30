package in.ashokit.service;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.request.Passanger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {

	// for this working urls start irctc app with other port number and get this
	// urls
	// as localhost:portnumber/url-givefor post or get method
	private String BOOK_TICKET_URL = "http://localhost:1212/bookings/ticket";

	private String GET_TICKET_URL = "http://localhost:1212/bookings/ticket/{ticketNumber}";

	@Override
	public Ticket bookTicket(Passanger passanger) {

//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Ticket> resEntity = rt.postForEntity(BOOK_TICKET_URL, passanger,Ticket.class);
//		Ticket ticket = resEntity.getBody();
		// return ticket;
		
		
//		using web client
		
//		Getting instance of WebClient impl class
		WebClient webClient = WebClient.create();
		
//		Send POST request with passenger data and map response to ticket obj
		
		Ticket ticket = webClient.post()
					.uri(BOOK_TICKET_URL)
					.bodyValue(passanger)
					.retrieve()
					.bodyToMono(Ticket.class)
					.block();

		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
//		RestTemplate rt = new RestTemplate();
//		ResponseEntity<Ticket> resEntity = rt.getForEntity(GET_TICKET_URL, Ticket.class,ticketNumber );
//		Ticket ticket = resEntity.getBody();
//      return ticket;

		
//		Getting instance of WebClient impl class
		WebClient webClient = WebClient.create();

		Ticket ticket = webClient.get()
				 				 .uri(GET_TICKET_URL, ticketNumber)
				 				 .retrieve()
				 				 .bodyToMono(Ticket.class)
				 				 .block();  // sync call

		return ticket;
	}

}
