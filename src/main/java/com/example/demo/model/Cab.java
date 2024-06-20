package com.example.demo.model;

public class Cab {
	
	private String carName;
	private String carNumber;
	private int seater;
	private double cabPrice;
	public Cab(String carName, String carNumber, int seater, double cabPrice) {
		super();
		this.carName = carName;
		this.carNumber = carNumber;
		this.seater = seater;
		this.cabPrice = cabPrice;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getSeater() {
		return seater;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public double getCabPrice() {
		return cabPrice;
	}
	public void setCabPrice(double cabPrice) {
		this.cabPrice = cabPrice;
	}
	
}
