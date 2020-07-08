package com.ticket.booking.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.booking.app.dao.TicketBookingDao;
import com.ticket.booking.app.entity.Ticket;

@Service
public class TicketBookingServices {

	@Autowired
	private TicketBookingDao ticketBookingDao;

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
}
