package com.xworkz.flight.dao;

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.dto.FlightTicketDTO;

public interface FlightTicketDAO {
	void flightTransaction(FlightDTO flight, FlightTicketDTO ticket);
}
