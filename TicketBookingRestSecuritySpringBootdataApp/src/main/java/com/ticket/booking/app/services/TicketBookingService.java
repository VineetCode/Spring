package com.ticket.booking.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.booking.app.dao.TicketBookingDao;
import com.ticket.booking.app.entity.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
		
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public Ticket updateTicketByIdAndEmail(Integer ticketId, String newEmail) {
		Ticket ticketFromDB=ticketBookingDao.findOne(ticketId);
		ticketFromDB.setEmail(newEmail);
		Ticket saveTicket=ticketBookingDao.save(ticketFromDB);
		return saveTicket;
	}

	public void deleteTicketById(Integer ticketId) {
		
	}

}
