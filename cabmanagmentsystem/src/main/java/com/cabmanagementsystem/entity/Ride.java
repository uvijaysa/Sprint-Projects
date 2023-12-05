package com.cabmanagementsystem.entity;

import java.time.LocalDateTime;

import com.cabmanagementsystem.util.RideStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Ride")
public class Ride {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rideId;
	@OneToOne
	private Customer customer;
	@OneToOne
	private Cab cab;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private RideStatus rideStatus;

	public Ride() {
	}

	public Ride(Integer rideId, Customer customer, Cab cab, String pickupLocation, String dropoffLocation,
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

	public Integer getRideId() {
		return rideId;
	}

	public void setRideId(Integer rideId) {
		this.rideId = rideId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
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
		return "Ride [rideId=" + rideId + ", customer=" + customer + ", cab=" + cab + ", pickupLocation="
				+ pickupLocation + ", dropoffLocation=" + dropoffLocation + ", startTime=" + startTime + ", endTime="
				+ endTime + ", rideStatus=" + rideStatus + "]";
	}

}