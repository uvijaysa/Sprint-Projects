package com.cabmanagementsystem.dto;

import java.time.LocalDateTime;

import com.cabmanagementsystem.util.RideStatus;

public class RideDTO {

	private int rideId;
	private CustomerDTO customer;
	private CabDTO cab;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private RideStatus rideStatus;
	
	public RideDTO() {
		super();
	}
	public RideDTO(int rideId, CustomerDTO customer, CabDTO cab, String pickupLocation, String dropoffLocation,
			LocalDateTime startTime, LocalDateTime endTime, RideStatus rideStatus) {
		super();
		this.rideId = rideId;
		this.customer = customer;
		this.cab = cab;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.startTime = startTime;
		this.endTime = endTime;
		this.rideStatus = rideStatus;
	}


	public int getRideId() {
		return rideId;
	}


	public void setRideId(int rideId) {
		this.rideId = rideId;
	}


	public CustomerDTO getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}


	public CabDTO getCab() {
		return cab;
	}


	public void setCab(CabDTO cab) {
		this.cab = cab;
	}


	public String getPickupLocation() {
		return pickupLocation;
	}


	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}


	public String getDropoffLocation() {
		return dropoffLocation;
	}


	public void setDropoffLocation(String dropoffLocation) {
		this.dropoffLocation = dropoffLocation;
	}


	public LocalDateTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}


	public LocalDateTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}


	public RideStatus getRideStatus() {
		return rideStatus;
	}


	public void setRideStatus(RideStatus rideStatus) {
		this.rideStatus = rideStatus;
	}


	@Override
	public String toString() {
		return "RideDTO [rideId=" + rideId + ", pickupLocation=" + pickupLocation + ", dropoffLocation="
				+ dropoffLocation + ", startTime=" + startTime + ", endTime=" + endTime + ", rideStatus=" + rideStatus
				+ "]";
	}
	
	
}
