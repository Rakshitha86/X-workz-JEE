package com.xworkz.flight.tester;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;

public class UpdateTester {

	public static void main(String[] args) {
		FlightDAO flightDAO = new FlightDAOImpl();
		boolean updateRecordBasedOnBrand = flightDAO.updateRecordBasedOnBrand(1500,"indigo");
		System.out.println(updateRecordBasedOnBrand);
	}

}
