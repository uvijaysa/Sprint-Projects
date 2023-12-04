package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagmentsystem.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
