package in.ashokit.service;

import in.ashokit.request.Passanger;
import in.ashokit.response.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passanger passanger);
	
	public Ticket getTicket(Integer ticketNumber);
}