package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.RoomBooking;
import com.example.demo.repo.RoomBookingRepository;

@Service
public class RoomBookingServiceImpl implements RoomBookingService{
	@Autowired
	RoomBookingRepository roomBookingRepo;
	@Override
    public RoomBooking createNewRecordService(RoomBooking room) {
        return roomBookingRepo.save(room);
    }
 
    @Override
    public List<RoomBooking> getAllRecordsService() {
        List<RoomBooking> roomBookingList = (List<RoomBooking>) roomBookingRepo.findAll();
        return roomBookingList;
    }
 
	@Override
	public Optional<RoomBooking> getOneRecordService(int id) {
		Optional<RoomBooking> b = roomBookingRepo.findById(id);
		return b;
	}
}
