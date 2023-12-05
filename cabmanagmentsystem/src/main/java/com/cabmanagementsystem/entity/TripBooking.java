package com.cabmanagementsystem.entity;

import java.time.LocalDateTime;

import com.cabmanagementsystem.util.BookingStatus;
import com.cabmanagementsystem.util.CabType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="TripBooking")
public class TripBooking{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int tripBookingId;
	@OneToOne	
	private Customer customer;
	private CabType cabType;
	private String pickupLocation;
	private String dropoffLocation;
	private LocalDateTime startDateTime;
	private BookingStatus bookingStatus;

	private Double distanceInKm;
	private Double bill;
	
	public TripBooking()
	{
		
	}
	
	
	public TripBooking(int tripBookingId, Customer customer, CabType cabType, String pickupLocation,
			String dropoffLocation, LocalDateTime startDateTime, BookingStatus bookingStatus, Double distanceInKm,
			Double bill) {
		super();
		this.tripBookingId = tripBookingId;
		this.customer = customer;
		this.cabType = cabType;
		this.pickupLocation = pickupLocation;
		this.dropoffLocation = dropoffLocation;
		this.startDateTime = startDateTime;
		this.bookingStatus = bookingStatus;
		this.distanceInKm = distanceInKm;
		this.bill = bill;
	}


	public Integer getTripBookingId() {
		return tripBookingId;
	}


	public void setTripBookingId(int tripBookingId) {
		this.tripBookingId = tripBookingId;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
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


	public Double getDistanceInKm() {
		return distanceInKm;
	}


	public void setDistanceInKm(Double distanceInKm) {
		this.distanceInKm = distanceInKm;
	}


	public Double getBill() {
		return bill;
	}


	public void setBill(Double bill) {
		this.bill = bill;
	}


	@Override
	public String toString() {
		return "TripBooking [tripBookingId=" + tripBookingId + ", pickupLocation=" + pickupLocation
				+ ", dropoffLocation=" + dropoffLocation + ", startDateTime=" + startDateTime + ", distanceInKm="
				+ distanceInKm + ", bill=" + bill + "]";
	}
	
	
	
	
	
}
