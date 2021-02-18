package com.xworkz.flight.tester;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class InsertTester {

	public static void main(String[] args) {
		FlightDAO flightDAO = new FlightDAOImpl();
//		FlightDTO flightDTO = new FlightDTO();
		FlightDTO flightDTO = new FlightDTO(1, "indigo", 400, "5am", "banglore", "delhi");
	boolean result = flightDAO.insertFlightRecords(flightDTO);
	System.out.println(result);
	}

}
