package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.FoodBooking;

@Repository
public interface FoodBookingRepository extends JpaRepository<FoodBooking,Integer> {

}
