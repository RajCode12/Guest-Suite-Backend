package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Customer;

public interface CustomerService {
	Customer createNewRecordService(Customer payment);
	List<Customer> getAllRecordsService();
	Optional<Customer> getOneRecordService(int id);
}
