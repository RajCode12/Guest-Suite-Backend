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

import com.example.demo.model.Cab;
import com.example.demo.model.HotelCab;
import com.example.demo.pojo.CabBooking;
import com.example.demo.service.CabBookingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/cabs")
public class CabBookingController {
	@Autowired
	private HotelCab hotelCab;
	@Autowired
	private CabBookingService cabBookingService;
	@PostMapping("/records")
   public CabBooking addData(@RequestBody CabBooking obj) {
       return cabBookingService.createNewRecordService(obj);
   }
   @GetMapping("/records")
   public List<CabBooking> getAllData() {
       return cabBookingService.getAllRecordsService();
   }
   @GetMapping("/cab/{id}")
	public Optional<CabBooking> getData(@PathVariable("id") int id){
		return cabBookingService.getOneRecordService(id);
	} 
   @GetMapping("/sources")
   public List<String> getSources() {
       return hotelCab.getSources();
   }

   @GetMapping("/destinations")
   public List<String> getDestinations() {
       return hotelCab.getDestinations();
   }

   @GetMapping("/cabs")
   public List<Cab> getCabs() {
       return hotelCab.getCabs();
   }
}
