package com.xworkz.flight.tester;

import java.util.ArrayList;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class InsertListOfRecordsTester {

	public static void main(String[] args) {

//		FlightDAO flightDAO = new FlightDAOImpl();
//		FlightDTO flightDTO1 = new FlightDTO(3, "SpaceJet",2000, "8am","Delhi","Mumbai");
//		FlightDTO flightDTO2 = new FlightDTO(4, "SpaceJet",4000, "9am","Delhi","Chennai");
//		FlightDTO flightDTO3 = new FlightDTO(5, "SpaceJet",6000, "10am","Delhi","Banglore");
//		FlightDTO flightDTO4 = new FlightDTO(6, "SpaceJet",8000, "11am","Delhi","Hydrabad");
//		System.out.println(flightDAO.insertFlightRecords(flightDTO2));

		// using batch process

		FlightDAO flightDAO = new FlightDAOImpl();
		ArrayList<FlightDTO> arrayList = new ArrayList<FlightDTO>();
		arrayList.add(new FlightDTO(7, "Air India", 1000, "6am", "Banglore", "chennai"));
		arrayList.add(new FlightDTO(8, "Air India", 3000, "7am", "Banglore", "Delhi"));
		arrayList.add(new FlightDTO(9, "Air India", 5000, "5am", "Banglore", "Hydrabad"));
		arrayList.add(new FlightDTO(10, "Air India", 7000, "12am", "Banglore", "Bombay"));
		flightDAO.insertListOfFlightRecords(arrayList);
	}

}
