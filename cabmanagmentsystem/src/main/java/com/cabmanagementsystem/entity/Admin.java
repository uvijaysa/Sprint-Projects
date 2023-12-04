
package com.cabmanagementsystem.entity;
 
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

import jakarta.persistence.Table;
 
@Entity

@Table(name="Admin")

public class Admin {

	@Id

	@GeneratedValue(strategy=GenerationType.AUTO)

	private int adminId;

	private String adminName;

	private String adminPassword;

	//Default Constructor	

	public Admin() {}

	//Constructor using fields	

	public Admin(int adminId, String adminName, String adminPassword) {

		super();

		this.adminId = adminId;

		this.adminName = adminName;

		this.adminPassword = adminPassword;

	}

	//Getters & Setters

	public int getAdminId() {

		return adminId;

	}
 
	public void setAdminId(int adminId) {

		this.adminId = adminId;

	}
 
	public String getAdminName() {

		return adminName;

	}
 
	public void setAdminName(String adminName) {

		this.adminName = adminName;

	}
 
	public String getAdminPassword() {

		return adminPassword;

	}
 
	public void setAdminPassword(String adminPassword) {

		this.adminPassword = adminPassword;

	}
 
	//toString

	@Override

	public String toString() {

		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";

	};

}
