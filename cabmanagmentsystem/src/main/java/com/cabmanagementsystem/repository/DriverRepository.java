package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabmanagementsystem.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
