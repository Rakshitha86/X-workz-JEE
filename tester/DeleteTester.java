package com.xworkz.flight.tester;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		FlightDAO flightDAO = new FlightDAOImpl();
		boolean deleteRecordBasedOnMobileId = flightDAO.deleteRecordBasedOnMobileId(2);
		System.out.println(deleteRecordBasedOnMobileId);
	}

}
