package com.xworkz.flight.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.flight.dto.FlightDTO;

public class FlightDAOImpl implements FlightDAO {

	@Override
	public Connection getDBConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/airlines";
		String userName = "root";
		String password = "root123";
		Connection connection = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println(connection);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		throw new SQLException();
	}

	@Override
	public boolean insertFlightRecords(FlightDTO dto) {

		Connection connection = null;
		PreparedStatement prepstmt = null;

		try {
			connection = getDBConnection();
			String sqlQuery = "insert into flight_details values(?,?,?,?,?,?)";
			prepstmt = connection.prepareStatement(sqlQuery);

			prepstmt.setInt(3, dto.getFuelCapacity());
			prepstmt.setInt(1, dto.getId());
			prepstmt.setString(4, dto.getArrivalTime());
			prepstmt.setString(2, dto.getName());
			prepstmt.setString(5, dto.getSource());
			prepstmt.setString(6, dto.getDestination());

			int result = prepstmt.executeUpdate();
			if (result >= 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				prepstmt.close();
				connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public ArrayList<Integer> insertListOfFlightRecords(ArrayList<FlightDTO> flightList) {
		Connection connection = null;
		PreparedStatement prepstmt = null;

		try {
			connection = getDBConnection();
			String sqlQuery = "insert into flight_details values(?,?,?,?,?,?)";
			prepstmt = connection.prepareStatement(sqlQuery);
			for (FlightDTO dto : flightList) {
				prepstmt.setInt(3, dto.getFuelCapacity());
				prepstmt.setInt(1, dto.getId());
				prepstmt.setString(4, dto.getArrivalTime());
				prepstmt.setString(2, dto.getName());
				prepstmt.setString(5, dto.getSource());
				prepstmt.setString(6, dto.getDestination());

//				int result = prepstmt.executeUpdate();
//				System.out.println("Result is: " + result);

				prepstmt.addBatch();
			}
			int[] resultArray = prepstmt.executeBatch();
			System.out.println("Results are: " + resultArray);
			for (int i : resultArray) {
				System.out.println(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepstmt != null)
					prepstmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ArrayList<FlightDTO> insertRecordsUsingBatch(ArrayList<FlightDTO> list) {
		Connection connection = null;
		Statement createStatement = null;
		try {
			connection = getDBConnection();
			createStatement = connection.createStatement();
			for (FlightDTO dto : list) {
				int id = dto.getId();
				String name = dto.getName();
				int fuelCapacity = dto.getFuelCapacity();
				String arrivalTime = dto.getArrivalTime();
				String source = dto.getSource();
				String destination = dto.getDestination();

				String sqlQuery = "insert into flight_details values(" + id + ",'" + name + "'," + fuelCapacity + ",'"
						+ arrivalTime + "','" + source + "','" + destination + "');";

				createStatement.addBatch(sqlQuery);
			}
			int[] result = createStatement.executeBatch();
			System.out.println("Results are: " + result);
			for (int i : result) {
				System.out.println(i);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (createStatement != null)
					createStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public boolean updateRecordBasedOnBrand(int newFuelCapacityValue, String name) {
		Connection connection = null;
		PreparedStatement prepstmt = null;
		try {
			connection = getDBConnection();

			String sqlQuery = " update flight_details set flightFuelCapacity=? where flightName=?";

			prepstmt = connection.prepareStatement(sqlQuery);

			prepstmt.setInt(1, newFuelCapacityValue);
			prepstmt.setString(2, name);
			int rowsEffected = prepstmt.executeUpdate();

			System.out.println("RowsEffected are: " + rowsEffected);
			if (rowsEffected >= 1)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepstmt != null)
					prepstmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return false;
	}

	@Override
	public boolean deleteRecordBasedOnMobileId(int Flightid) {
		Connection connection = null;
		PreparedStatement prepstmt = null;
		try {
			connection = getDBConnection();

			String sqlQuery = " delete from flight_details where flightId =?; ";

			prepstmt = connection.prepareStatement(sqlQuery);
			prepstmt.setInt(1, Flightid);
			int rowsDeleted = prepstmt.executeUpdate();
			System.out.println("RowsDeleted are: " + rowsDeleted);
			if (rowsDeleted >= 1)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepstmt != null)
					prepstmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return false;
	}

}
