package com.cabmanagementsystem.dto;

import com.cabmanagementsystem.util.CabType;

public class CabDTO {
	
	private int cabId;
	private CabType cabType;
	private DriverDTO driver;
	private double ratePerKm;
	private String registrationNo;
	private Boolean cabAvailability;
	private String currentLocation;
	
	public CabDTO() {
		super();
	}
	public CabDTO(int cabId, CabType cabType, DriverDTO driver, double ratePerKm, String registrationNo,
			Boolean cabAvailability, String currentLocation) {
		super();
		this.cabId = cabId;
		this.cabType = cabType;
		this.driver = driver;
		this.ratePerKm = ratePerKm;
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


	public DriverDTO getDriver() {
		return driver;
	}


	public void setDriver(DriverDTO driver) {
		this.driver = driver;
	}


	public double getRatePerKm() {
		return ratePerKm;
	}


	public void setRatePerKm(double ratePerKm) {
		this.ratePerKm = ratePerKm;
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
		return "CabDTO [cabId=" + cabId + ", cabType=" + cabType + ", ratePerKm=" + ratePerKm + ", registrationNo="
				+ registrationNo + ", cabAvailability=" + cabAvailability + ", currentLocation=" + currentLocation
				+ "]";
	}

	
}