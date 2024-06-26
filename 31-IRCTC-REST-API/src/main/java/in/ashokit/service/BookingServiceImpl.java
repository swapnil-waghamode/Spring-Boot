package in.ashokit.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.request.Passanger;
import in.ashokit.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {
	
	Map<Integer, Ticket> ticketMap = new HashMap<>();
	
	private Integer ticketNumber = 1;

	@Override
	public Ticket bookTicket(Passanger passanger) {
		// logic 
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passanger, t);
		
		t.setTicketCost(550.00);
		t.setStatus("CONFIRMD");
		t.setTicketNumber(ticketNumber);
	
		ticketMap.put(ticketNumber, t);
		
		ticketNumber++;
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
		
		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		
		return null;
	}

}
