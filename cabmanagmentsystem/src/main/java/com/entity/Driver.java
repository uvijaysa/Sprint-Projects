package com.cabmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="Driver")
 
public class Driver extends User{

	@Id

	@GeneratedValue(strategy=GenerationType.AUTO)


	private String driverName;

	private String licenseNo;

	private Boolean driverAvailability;

	public Driver() {

	}

	public Driver(String driverName, String licenseNo, Boolean driverAvailability) {

		super();

		this.driverName = driverName;

		this.licenseNo = licenseNo;

		this.driverAvailability = driverAvailability;

	}

	public String getDriverName() {

		return driverName;

	}

	public void setDriverName(String driverName) {

		this.driverName = driverName;

	}

	public String getLicenseNo() {

		return licenseNo;

	}

	public void setLicenseNo(String licenseNo) {

		this.licenseNo = licenseNo;

	}

	public Boolean getDriverAvailability() {

		return driverAvailability;

	}

	public void setDriverAvailability(Boolean driverAvailability) {

		this.driverAvailability = driverAvailability;

	}

	@Override

	public String toString() {

		return "Driver [driverName=" + driverName + ", licenseNo=" + licenseNo + ", driverAvailability="

				+ driverAvailability + "]";

	}

 
}


