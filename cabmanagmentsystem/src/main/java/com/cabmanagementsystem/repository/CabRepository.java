package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagementsystem.entity.Cab;

public interface CabRepository  extends JpaRepository<Cab, Integer>{
	
	

}
