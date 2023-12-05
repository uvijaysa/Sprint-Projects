package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabmanagementsystem.entity.Cab;
@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {

}
