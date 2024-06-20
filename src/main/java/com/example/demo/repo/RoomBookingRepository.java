package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.RoomBooking;

@Repository
public interface RoomBookingRepository extends JpaRepository<RoomBooking,Integer> {

}
