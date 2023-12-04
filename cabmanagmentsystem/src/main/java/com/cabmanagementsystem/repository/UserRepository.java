package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
