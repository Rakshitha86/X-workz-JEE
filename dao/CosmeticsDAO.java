package dao;

import java.util.List;

import dto.CosmeticsDTO;

public interface CosmeticsDAO {

	boolean save(CosmeticsDTO dto);

	List<CosmeticsDTO> readAllRecords();

	boolean updateRecordBasedOnBrand(double newPriceValue, String brand);

	boolean deleteRecordBasedOnCosmeticsId(int cosmeticId);

}
