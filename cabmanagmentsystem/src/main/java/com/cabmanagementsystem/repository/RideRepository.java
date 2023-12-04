package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagementsystem.entity.Ride;

public interface RideRepository extends JpaRepository<Ride, Integer>{

}
