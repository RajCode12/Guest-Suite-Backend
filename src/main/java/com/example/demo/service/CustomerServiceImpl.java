package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerRepo;
	@Override
    public Customer createNewRecordService(Customer customer) {
        return customerRepo.save(customer);
    }
 
    @Override
    public List<Customer> getAllRecordsService() {
        List<Customer> customerList = (List<Customer>) customerRepo.findAll();
        return customerList;
    }
 
	@Override
	public Optional<Customer> getOneRecordService(int id) {
		Optional<Customer> b = customerRepo.findById(id);
		return b;
	}
}
