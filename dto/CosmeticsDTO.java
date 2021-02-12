package dto;

public class CosmeticsDTO {
	private int cosmeticsId;
	private double price;
	private String name;
	private String brand;
	private int quantity;

	public CosmeticsDTO() {

	}

	public CosmeticsDTO(int cosmeticsId, double price, String name, String brand, int quantity) {
		super();
		this.cosmeticsId = cosmeticsId;
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
	}

	public int getCosmeticsId() {
		return cosmeticsId;
	}

	public void setCosmeticsId(int cosmeticsId) {
		this.cosmeticsId = cosmeticsId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticsDTO [cosmeticsId=" + cosmeticsId + ", price=" + price + ", name=" + name + ", brand=" + brand
				+ ", quantity=" + quantity + "]";
	}

}
