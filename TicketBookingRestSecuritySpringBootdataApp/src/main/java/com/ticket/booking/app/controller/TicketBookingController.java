package com.ticket.booking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.booking.app.entity.Ticket;
import com.ticket.booking.app.services.TicketBookingService;

@RestController
@RequestMapping(value = "/api")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/admin/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value = "/tickets/ticketId/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}

	@GetMapping(value = "/tickets/alltickets")
	public Iterable<Ticket> getAllBookedTicket() {
		return ticketBookingService.getAllBookedTickets();
	}

	@PutMapping(value = "/admin/ticketId/{ticketId}/email/{newEmail:.+}")
	public Ticket updateTicketByIdAndEmail(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {
		return ticketBookingService.updateTicketByIdAndEmail(ticketId, newEmail);
	}

	@DeleteMapping(value = "/admin/ticketId/{ticketId}")
	public void deleteTicketById(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicketById(ticketId);
	}

}
