package com.xworkz.flight.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.flight.dto.FlightDTO;
import com.xworkz.flight.dto.FlightTicketDTO;

public class FlightTicketDAOImpl implements FlightTicketDAO {

	@Override
	public void flightTransaction(FlightDTO flight, FlightTicketDTO ticket) {
		FlightDAO dao = new FlightDAOImpl();
		Connection conn = null;
		try {
			conn = dao.getDBConnection();
			conn.setAutoCommit(false);

			// insert into flight

			String flightQuery = "insert into flight_details values(?,?,?,?,?,?)";
			PreparedStatement prepstmt = conn.prepareStatement(flightQuery);

			prepstmt.setInt(3, flight.getFuelCapacity());
			prepstmt.setInt(1, flight.getId());
			prepstmt.setString(4, flight.getArrivalTime());
			prepstmt.setString(2, flight.getName());
			prepstmt.setString(5, flight.getSource());
			prepstmt.setString(6, flight.getDestination());

			int flightResult = prepstmt.executeUpdate();
			System.out.println(flightResult);

			// insert into ticket

			String ticketQuery = "insert into ticket values(?,?,?,?,?)";
			PreparedStatement prepstmt2 = conn.prepareStatement(ticketQuery);

			prepstmt2.setInt(1, ticket.getTicketId());
			prepstmt2.setString(2, ticket.getSeatNo());
			prepstmt2.setInt(3, ticket.getPrice());
			prepstmt2.setInt(4, ticket.getPax());
			prepstmt2.setString(5, ticket.getType());

			int ticketResult = prepstmt2.executeUpdate();
			System.out.println(ticketResult);

			conn.commit();

		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();

			}
			e.printStackTrace();
		}
		catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();

			}
			e.printStackTrace();
			}
	}

}
