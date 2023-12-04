package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagmentsystem.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
