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

import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@PostMapping("/records")
   public Customer addData(@RequestBody Customer obj) {
       return customerService.createNewRecordService(obj);
   }
   @GetMapping("/records")
   public List<Customer> getAllData() {
       return customerService.getAllRecordsService();
   }
   @GetMapping("/customer/{id}")
	public Optional<Customer> getData(@PathVariable("id") int id){
		return customerService.getOneRecordService(id);
	}  
}
