package com.xworkz.cosmetics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnectionToCosmeticsTable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/cosmetics";
		String userName = "root";
		String password = "root123";

		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection(url, userName, password);
				System.out.println(connection);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
