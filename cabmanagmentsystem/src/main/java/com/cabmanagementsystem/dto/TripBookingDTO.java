package com.cabmanagementsystem.dto;

import java.time.LocalDateTime;

import com.cabmanagementsystem.util.BookingStatus;
import com.cabmanagementsystem.util.CabType;

public class TripBookingDTO {

	private int tripBookingId;
	private CustomerDTO customer;
	private CabType cabType;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startDateTime;
	private BookingStatus bookingStatus;
	
	private double distanceInKm;
	private double bil;
	
	public TripBookingDTO() {
		super();
	}
	public TripBookingDTO(int tripBookingId, CustomerDTO customer, CabType cabType, String pickupLocation,
			String dropoffLocation, LocalDateTime startDateTime, BookingStatus bookingStatus, double distanceInKm,
			double bil) {
		super();
		this.tripBookingId = tripBookingId;
		this.customer = customer;
		this.cabType = cabType;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.startDateTime = startDateTime;
		this.bookingStatus = bookingStatus;
		this.distanceInKm = distanceInKm;
		this.bil = bil;
	}


	public int getTripBookingId() {
		return tripBookingId;
	}


	public void setTripBookingId(int tripBookingId) {
		this.tripBookingId = tripBookingId;
	}


	public CustomerDTO getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}


	public CabType getCabType() {
		return cabType;
	}


	public void setCabType(CabType cabType) {
		this.cabType = cabType;
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


	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}


	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}


	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}


	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public double getDistanceInKm() {
		return distanceInKm;
	}


	public void setDistanceInKm(double distanceInKm) {
		this.distanceInKm = distanceInKm;
	}


	public double getBil() {
		return bil;
	}


	public void setBil(double bil) {
		this.bil = bil;
	}


	@Override
	public String toString() {
		return "TripBookingDTO [tripBookingId=" + tripBookingId + ", customer=" + customer + ", pickupLocation="
				+ pickupLocation + ", dropoffLocation=" + dropoffLocation + ", distanceInKm=" + distanceInKm + ", bil="
				+ bil + "]";
	}
	
	
}
