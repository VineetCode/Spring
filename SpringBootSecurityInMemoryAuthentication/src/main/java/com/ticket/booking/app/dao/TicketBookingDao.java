package com.ticket.booking.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.ticket.booking.app.entity.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {

}
