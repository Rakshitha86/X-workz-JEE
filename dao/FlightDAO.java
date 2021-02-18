package com.xworkz.flight.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightDAO {

	Connection getDBConnection() throws SQLException;

	boolean insertFlightRecords(FlightDTO dto);

	ArrayList<Integer> insertListOfFlightRecords(ArrayList<FlightDTO> flightList);
	
	ArrayList<FlightDTO> insertRecordsUsingBatch(ArrayList<FlightDTO> list);

	boolean updateRecordBasedOnBrand(int newFuelCapacityValue, String name);

	boolean deleteRecordBasedOnMobileId(int Flightid);

}
