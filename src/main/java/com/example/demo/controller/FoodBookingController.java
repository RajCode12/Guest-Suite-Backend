package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Food;
import com.example.demo.model.HotelFood;
import com.example.demo.pojo.FoodBooking;
import com.example.demo.service.FoodBookingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/foods")
public class FoodBookingController {
	@Autowired
	private HotelFood hotelFood;
	@Autowired
	private FoodBookingService foodBookingService;
	@PostMapping("/records")
   public FoodBooking addData(@RequestBody FoodBooking obj) {
       return foodBookingService.createNewRecordService(obj);
   }
   @GetMapping("/records")
   public List<FoodBooking> getAllData() {
       return foodBookingService.getAllRecordsService();
   }
   @GetMapping("/food/{id}")
	public Optional<FoodBooking> getData(@PathVariable("id") int id){
		return foodBookingService.getOneRecordService(id);
	}  
   @GetMapping("/starters")
   public List<Food> getStarters() {
       return hotelFood.getStarters();
   }

   @GetMapping("/mainfood")
   public List<Food> getMainFood() {
       return hotelFood.getMainFood();
   }

   @GetMapping("/drinks")
   public List<Food> getDrinks() {
	   return hotelFood.getDrinks();
   }
}
