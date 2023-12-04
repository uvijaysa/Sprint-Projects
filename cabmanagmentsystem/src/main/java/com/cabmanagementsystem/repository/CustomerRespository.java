package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagmentsystem.entity.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Integer> {

}
