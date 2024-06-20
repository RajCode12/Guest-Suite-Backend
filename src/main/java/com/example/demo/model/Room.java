package com.example.demo.model;

public class Room {
	
	private int roomNumber;
	private String type;
	private String description;
	private double roomPrice;
	private boolean isBooked;
	
	public Room(int roomNumber, String type, String description, double roomPrice, boolean isBooked) {
		super();
		this.roomNumber = roomNumber;
		this.type = type;
		this.description = description;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
}
