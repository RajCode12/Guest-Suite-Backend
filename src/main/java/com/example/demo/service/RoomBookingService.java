package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.RoomBooking;

public interface RoomBookingService {
	RoomBooking createNewRecordService(RoomBooking roomBooking);
	List<RoomBooking> getAllRecordsService();
	Optional<RoomBooking> getOneRecordService(int id);
}
