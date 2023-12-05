package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabmanagementsystem.entity.TripBooking;

@Repository
public interface TripBookingRepository extends JpaRepository<TripBooking, Integer> {

}
