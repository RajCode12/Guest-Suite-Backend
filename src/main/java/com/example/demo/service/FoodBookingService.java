package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.FoodBooking;

public interface FoodBookingService {
	FoodBooking createNewRecordService(FoodBooking foodBooking);
	List<FoodBooking> getAllRecordsService();
	Optional<FoodBooking> getOneRecordService(int id);
}
