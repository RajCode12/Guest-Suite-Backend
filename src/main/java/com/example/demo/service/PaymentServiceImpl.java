package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Payment;
import com.example.demo.repo.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	PaymentRepository paymentRepo;
	@Override
    public Payment createNewRecordService(Payment payment) {
        return paymentRepo.save(payment);
    }
 
    @Override
    public List<Payment> getAllRecordsService() {
        List<Payment> paymentList = (List<Payment>) paymentRepo.findAll();
        return paymentList;
    }
 
	@Override
	public Optional<Payment> getOneRecordService(int id) {
		Optional<Payment> b = paymentRepo.findById(id);
		return b;
	}
}
