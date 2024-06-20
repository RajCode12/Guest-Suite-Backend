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

import com.example.demo.pojo.Payment;
import com.example.demo.service.PaymentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/payments")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	@PostMapping("/records")
   public Payment addData(@RequestBody Payment obj) {
       return paymentService.createNewRecordService(obj);
   }
   @GetMapping("/records")
   public List<Payment> getAllData() {
       return paymentService.getAllRecordsService();
   }
   @GetMapping("/payment/{id}")
	public Optional<Payment> getData(@PathVariable("id") int id){
		return paymentService.getOneRecordService(id);
	}  
}

