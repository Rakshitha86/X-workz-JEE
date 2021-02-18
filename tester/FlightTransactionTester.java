package com.xworkz.flight.tester;

import com.xworkz.flight.dao.FlightTicketDAO;
import com.xworkz.flight.dao.FlightTicketDAOImpl;
import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.dto.FlightTicketDTO;

public class FlightTransactionTester {

	public static void main(String[] args) {
		
		//executing on commit without rollback
		FlightTicketDAO flightTicketDAO = new FlightTicketDAOImpl();
		FlightDTO flightDTO = new FlightDTO(19, "Go Air",4000, "6am","Banglore", "Delhi");
		FlightTicketDTO flightTicketDTO = new FlightTicketDTO(2
				, "24RA",2000, 2, "Business");
		flightTicketDAO.flightTransaction(flightDTO, flightTicketDTO);
		
		//executing on rollback
//		FlightTicketDAO flightTicketDAO = new FlightTicketDAOImpl();
//		FlightDTO flightDTO = new FlightDTO(18, "Go Air",4000, "6am","Banglore", "Delhi");
//		FlightTicketDTO flightTicketDTO = new FlightTicketDTO(1, "24RA",2000, 2, "Business");
//		flightTicketDAO.flightTransaction(flightDTO, flightTicketDTO);
	}

}
