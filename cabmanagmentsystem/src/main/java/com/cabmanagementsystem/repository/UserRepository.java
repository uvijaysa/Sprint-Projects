package com.cabmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cabmanagmentsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
