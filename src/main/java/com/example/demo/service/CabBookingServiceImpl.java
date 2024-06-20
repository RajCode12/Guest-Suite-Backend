package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.CabBooking;
import com.example.demo.repo.CabBookingRepository;

@Service
public class CabBookingServiceImpl implements CabBookingService{
	@Autowired
	CabBookingRepository cabBookingRepo;
	@Override
    public CabBooking createNewRecordService(CabBooking cab) {
        return cabBookingRepo.save(cab);
    }
 
    @Override
    public List<CabBooking> getAllRecordsService() {
        List<CabBooking> cabBookingList = (List<CabBooking>) cabBookingRepo.findAll();
        return cabBookingList;
    }
 
	@Override
	public Optional<CabBooking> getOneRecordService(int id) {
		Optional<CabBooking> b = cabBookingRepo.findById(id);
		return b;
	}
}
