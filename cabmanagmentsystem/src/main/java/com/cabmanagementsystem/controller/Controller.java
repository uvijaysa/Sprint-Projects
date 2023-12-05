package com.cabmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabmanagementsystem.entity.Customer;
import com.cabmanagementsystem.service.CustomerService;

@RestController
public class Controller {
	
	@Autowired
	private CustomerService cservice;
	
	@PostMapping("/add")
	  private String addCustomer(@RequestBody Customer customer)
	  {
		        return  cservice.addCustomer(customer);
	  }

}
