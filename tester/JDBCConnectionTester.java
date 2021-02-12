package tester;

import dao.CosmeticsDAO;
import dao.CosmeticsDAOImpl;
import dto.CosmeticsDTO;

public class JDBCConnectionTester {

	public static void main(String[] args) {

		CosmeticsDAO cosmeticsDAO = new CosmeticsDAOImpl();
		CosmeticsDTO cosmeticsDTO = new CosmeticsDTO(8, 600.00, "Muscara", " Sugar", 2);
		System.out.println("Saving the records to DB: " + cosmeticsDTO);
		boolean result = cosmeticsDAO.save(cosmeticsDTO);
		if (result) {
			System.out.println("Record inserted successfully");
		} else {
			System.out.println("There was a problem while inserting records");
		}

	}

}
