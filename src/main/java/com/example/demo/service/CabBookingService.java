package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.CabBooking;

public interface CabBookingService {
	CabBooking createNewRecordService(CabBooking cabBooking);
	List<CabBooking> getAllRecordsService();
	Optional<CabBooking> getOneRecordService(int id);
}
