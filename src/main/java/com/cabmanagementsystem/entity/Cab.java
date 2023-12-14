package com.cabmanagementsystem.entity;

import com.cabmanagementsystem.util.CabType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="Cab")
public class Cab {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int cabId;
	private CabType cabType;
	@OneToOne(cascade= CascadeType.ALL)
	private Driver driver;
	private double rateperkm;
	private String registrationNo;
	private Boolean cabAvailability;
	private String currentLocation;

	public Cab() {
	}

	public Cab(int cabId, CabType cabType, Driver driver, double rateperkm, String registrationNo,
			Boolean cabAvailability, String currentLocation) {
		super();
		this.cabId = cabId;
		this.cabType = cabType;
		this.driver = driver;
		this.rateperkm = rateperkm;
		this.registrationNo = registrationNo;
		this.cabAvailability = cabAvailability;
		this.currentLocation = currentLocation;
	}

	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public CabType getCabType() {
		return cabType;
	}

	public void setCabType(CabType cabType) {
		this.cabType = cabType;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public double getRateperkm() {
		return rateperkm;
	}

	public void setRateperkm(double rateperkm) {
		this.rateperkm = rateperkm;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Boolean getCabAvailability() {
		return cabAvailability;
	}

	public void setCabAvailability(Boolean cabAvailability) {
		this.cabAvailability = cabAvailability;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", rateperkm=" + rateperkm + ", registrationNo=" + registrationNo
				+ ", cabAvailability=" + cabAvailability + ", currentLocation=" + currentLocation + "]";
	}

}