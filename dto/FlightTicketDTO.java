package com.xworkz.flight.dto;

public class FlightTicketDTO {
	private int ticketId;
	private String seatNo;
	private int price;
	private int pax;
	private String type;

	public FlightTicketDTO() {

	}

	public FlightTicketDTO(int ticketId, String seatNo, int price, int pax, String type) {
		super();
		this.ticketId = ticketId;
		this.seatNo = seatNo;
		this.price = price;
		this.pax = pax;
		this.type = type;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPax() {
		return pax;
	}

	public void setPax(int pax) {
		this.pax = pax;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FlightTicketDTO [ticketId=" + ticketId + ", seatNo=" + seatNo + ", price=" + price + ", pax=" + pax
				+ ", type=" + type + "]";
	}

}
