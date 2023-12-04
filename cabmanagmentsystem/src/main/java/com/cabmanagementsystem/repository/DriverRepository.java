package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagementsystem.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
