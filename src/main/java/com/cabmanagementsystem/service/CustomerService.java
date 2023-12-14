package com.cabmanagementsystem.service;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabmanagementsystem.dto.CustomerDTO;
import com.cabmanagementsystem.entity.Customer;
import com.cabmanagementsystem.exception.CustomerNotFoundException;
import com.cabmanagementsystem.repository.CustomerRepository;
@Service
public class CustomerService implements ICustomerService {
	
    @Autowired
    private CustomerRepository cRepo;
    @Autowired
    private ModelMapper modelMapper;
    
    @Override
    public CustomerDTO registerCustomer(CustomerDTO customer) {
        Customer CustomerDAO = modelMapper.map(customer, Customer.class);
        CustomerDAO = cRepo.save(CustomerDAO);
        CustomerDTO customer1 = modelMapper.map(CustomerDAO, CustomerDTO.class);
        return customer1;
    }
    
    @Override
    public CustomerDTO updateCustomer(CustomerDTO customer) {
        Customer CustomerDAO = modelMapper.map(customer, Customer.class);
        System.out.println("User ID : "+cRepo.existsById(CustomerDAO.getUserId()));
        if (cRepo.existsById(CustomerDAO.getUserId())) {
           
            CustomerDAO = cRepo.save(CustomerDAO);
        }else
        {
        	throw new CustomerNotFoundException("Customer not found and cannot be updated");
        }
        CustomerDTO customer1 = modelMapper.map(CustomerDAO, CustomerDTO.class);
        return customer1;
    }
    
    @Override
    public List < CustomerDTO > viewCustomers() {
        List < Customer > customerDAOList = cRepo.findAll();
        List < CustomerDTO > customerDTOList = new ArrayList < > ();
        CustomerDTO customerDTO;
        for (int i = 0; i < customerDAOList.size(); i++) {
            customerDTO = modelMapper.map(customerDAOList.get(i), CustomerDTO.class);
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }
    
    @Override
    public CustomerDTO viewCustomerById(Integer customerId) {
    	
         if(cRepo.existsById(customerId)) {
        Customer CustomerDAO = cRepo.findById(customerId).get();
        CustomerDTO customerDTO = modelMapper.map(CustomerDAO, CustomerDTO.class);
        return customerDTO;
         }else
         {
        	   throw new CustomerNotFoundException("Given customer id not found");
         }
	
    }
    
}