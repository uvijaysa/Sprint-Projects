package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagementsystem.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
