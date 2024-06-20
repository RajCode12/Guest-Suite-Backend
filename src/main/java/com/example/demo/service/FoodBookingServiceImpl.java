package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.FoodBooking;
import com.example.demo.repo.FoodBookingRepository;

@Service
public class FoodBookingServiceImpl implements FoodBookingService{
	@Autowired
	FoodBookingRepository foodBookingRepo;
	@Override
    public FoodBooking createNewRecordService(FoodBooking food) {
        return foodBookingRepo.save(food);
    }
 
    @Override
    public List<FoodBooking> getAllRecordsService() {
        List<FoodBooking> foodBookingList = (List<FoodBooking>) foodBookingRepo.findAll();
        return foodBookingList;
    }
 
	@Override
	public Optional<FoodBooking> getOneRecordService(int id) {
		Optional<FoodBooking> b = foodBookingRepo.findById(id);
		return b;
	}
}
