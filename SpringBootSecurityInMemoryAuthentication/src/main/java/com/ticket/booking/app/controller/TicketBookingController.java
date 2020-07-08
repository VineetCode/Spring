package com.ticket.booking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.booking.app.entity.Ticket;
import com.ticket.booking.app.services.TicketBookingServices;

@RestController
@RequestMapping(value="/api")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingServices ticketBookingServices;
	
	@GetMapping(value="/tickets/ticketId/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId){
		return ticketBookingServices.getTicketById(ticketId);
	}
	
	@GetMapping(value="/admin/tickets/allticket")
	public Iterable<Ticket> getAllBookedTickets(){
		return ticketBookingServices.getAllBookedTickets();
	}

}
