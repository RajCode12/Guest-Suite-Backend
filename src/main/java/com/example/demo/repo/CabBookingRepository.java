package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.CabBooking;


@Repository
public interface CabBookingRepository extends JpaRepository<CabBooking,Integer> {

}
