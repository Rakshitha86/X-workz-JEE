package com.xworkz.flight.tester;

import java.util.ArrayList;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class insertRecordBatchTester {

	public static void main(String[] args) {
		FlightDAO flightDAO = new FlightDAOImpl();
		ArrayList<FlightDTO> arrayList = new ArrayList<FlightDTO>();
		arrayList.add(new FlightDTO(12, "Space Jet", 1000, "6am", "Banglore", "chennai"));
		arrayList.add(new FlightDTO(13, "Space Jet", 3000, "7am", "Banglore", "Delhi"));
		arrayList.add(new FlightDTO(14, "Space Jet", 5000, "5am", "Banglore", "Hydrabad"));
		arrayList.add(new FlightDTO(15, "Space Jet", 7000, "12am", "Banglore", "Bombay"));
		flightDAO.insertRecordsUsingBatch(arrayList);
	}

}
