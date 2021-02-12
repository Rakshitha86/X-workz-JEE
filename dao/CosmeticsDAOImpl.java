package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dto.CosmeticsDTO;

public class CosmeticsDAOImpl implements CosmeticsDAO {

	@Override
	public boolean save(CosmeticsDTO dto) {
		String url = "jdbc:mysql://localhost:3306/cosmetics";
		String userName = "root";
		String password = "root123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println(connection);

			Statement createStatement = connection.createStatement();
			int id = dto.getCosmeticsId();
			double price = dto.getPrice();
			String name = dto.getName();
			String brand = dto.getBrand();
			int qty = dto.getQuantity();
			String sqlQuery = "insert into cosmetics value("+id+","+price+",'"+name+"','"+brand+"',"+qty+")";


			int result = createStatement.executeUpdate(sqlQuery);
			if (result >= 1)
				return true;
			else
				return false;

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<CosmeticsDTO> readAllRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRecordBasedOnBrand(double newPriceValue, String brand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRecordBasedOnCosmeticsId(int cosmeticId) {
		// TODO Auto-generated method stub
		return false;
	}

}
