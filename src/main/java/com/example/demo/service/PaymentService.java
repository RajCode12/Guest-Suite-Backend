package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Payment;

public interface PaymentService {
	Payment createNewRecordService(Payment payment);
	List<Payment> getAllRecordsService();
	Optional<Payment> getOneRecordService(int id);
}
