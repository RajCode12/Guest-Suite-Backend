package com.example.demo.model;

public class Food {
	
	private String name;
	private String type;
	private double foodPrice;
	
	public Food(String name, String type, double foodPrice) {
		super();
		this.name = name;
		this.type = type;
		this.foodPrice = foodPrice;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	
}
