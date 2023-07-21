package com.example.newProject.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.newProject.Entity.Customer;
import com.example.newProject.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/postCustomerDetails") 
	
	public String postMenthod(@RequestBody Customer customer) {
		customerService.postCustomerDetails(customer);
		return "Customer Details are updated";
		
	}
	
	
	
}
