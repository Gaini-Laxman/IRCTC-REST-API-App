package com.klinnovations.service;


import com.klinnovations.request.Passenger;
import com.klinnovations.response.Ticket;

public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
