package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabmanagementsystem.entity.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Integer> {

}
