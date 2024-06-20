package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HotelFood {
	public static void main(String[] args) {
		HotelFood hotelFood = new HotelFood();

        System.out.println("Starters:");
        hotelFood.getStarters().forEach(food -> 
            System.out.println(food.getName() + " - " + food.getType() + " - $" + food.getFoodPrice()));

        System.out.println("\nMain Food:");
        hotelFood.getMainFood().forEach(food -> 
            System.out.println(food.getName() + " - " + food.getType() + " - $" + food.getFoodPrice()));

        System.out.println("\nDrinks:");
        hotelFood.getDrinks().forEach(food -> 
            System.out.println(food.getName() + " - " + food.getType() + " - $" + food.getFoodPrice()));
	}
    public List<Food> getStarters() {
        return Arrays.asList(
            new Food("Aloo Paratha", "Breakfast", 60),
            new Food("Paneer Paratha", "Breakfast", 80),
            new Food("Sandwich", "Breakfast", 50),
            new Food("Mix Paratha", "Breakfast", 70)
        );
    }
    public List<Food> getMainFood() {
        return Arrays.asList(
            new Food("Veg Thali", "Lunch", 120),
            new Food("Non-Veg Thali", "Lunch", 180),
            new Food("Paneer Do Pyaza", "Lunch", 150),
            new Food("Butter Naan", "Lunch", 50)
        );
    }
    public List<Food> getDrinks() {
        return Arrays.asList(
            new Food("Milk Shake", "Drinks", 60),
            new Food("Maaza", "Drinks", 40),
            new Food("Coke", "Drinks", 50),
            new Food("Sprite", "Drinks", 40)
        );
    }
}
