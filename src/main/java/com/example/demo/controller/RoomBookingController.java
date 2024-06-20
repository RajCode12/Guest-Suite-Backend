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

import com.example.demo.model.HotelRoom;
import com.example.demo.model.Room;
import com.example.demo.pojo.RoomBooking;
import com.example.demo.service.RoomBookingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/rooms")
public class RoomBookingController {
	@Autowired
	private HotelRoom hotelRoom;
	@Autowired
	private RoomBookingService roomBookingService;
//	@PostMapping("/records")
//   public RoomBooking addData(@RequestBody RoomBooking obj) {
//       return roomBookingService.createNewRecordService(obj);
//   }
   @GetMapping("/records")
   public List<RoomBooking> getAllData() {
       return roomBookingService.getAllRecordsService();
   }
   @GetMapping("/room/{id}")
	public Optional<RoomBooking> getData(@PathVariable("id") int id){
		return roomBookingService.getOneRecordService(id);
	}
   
   
   @PostMapping("/book")
   public Room bookRoom(@RequestBody RoomBooking booking) {
       Room bookedRoom = hotelRoom.bookRoom(booking.getType());
       if (bookedRoom != null) {
           this.roomBookingService.createNewRecordService(booking);
           return bookedRoom;
       }
       return null;
   }

   @GetMapping("/available")
   public List<Room> getAvailableRooms() {
       return hotelRoom.getAllRooms();
   }
}
