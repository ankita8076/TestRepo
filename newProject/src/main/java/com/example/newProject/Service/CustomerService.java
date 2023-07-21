package com.example.newProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.newProject.Entity.Customer;
import com.example.newProject.Repository.CustomerRepo;

@Service

public class CustomerService {
	
	@Autowired
	CustomerRepo customerRepo;

	public void postCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		customerRepo.save(customer);
	}
}


