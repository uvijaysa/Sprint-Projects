package com.cabmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabmanagementsystem.entity.Customer;
import com.cabmanagementsystem.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	  private CustomerRepository customerRepo;
	
	
	   public String addCustomer(Customer customer)
	   {
		     customerRepo.save(customer);
		     return "customer added";
	   }
	

}
