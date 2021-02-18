package com.xworkz.flight.dto;

public class FlightDTO {

	private int id;
	private String name;
	private int fuelCapacity;
	private String arrivalTime;
	private String source;
	private String destination;

	public FlightDTO() {
	}

	public FlightDTO(int id, String name, int fuelCapacity, String arrivalTime, String source, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.fuelCapacity = fuelCapacity;
		this.arrivalTime = arrivalTime;
		this.source = source;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "FlightDTO [id=" + id + ", name=" + name + ", fuelCapacity=" + fuelCapacity + ", arrivalTime="
				+ arrivalTime + ", source=" + source + ", destination=" + destination + "]";
	}

}
