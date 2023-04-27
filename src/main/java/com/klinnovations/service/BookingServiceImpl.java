package com.klinnovations.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.klinnovations.request.Passenger;
import com.klinnovations.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, Ticket> ticketMap = new HashMap();
	private Integer ticketNum = 1;

	@Override
	public Ticket bookTicket(Passenger passenger) {

		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(150.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);

		ticketMap.put(ticketNum, t);
		ticketNum++;

		return t;

	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {

		if (ticketMap.containsKey(ticketNumber)) {

			return ticketMap.get(ticketNumber);

		}

		return null;
	}

}
