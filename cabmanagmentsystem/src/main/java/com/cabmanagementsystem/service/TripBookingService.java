package com.cabmanagementsystem.service;

import java.time.LocalDate;
import java.util.List;

import com.cabmanagementsystem.dto.TripBookingDTO;

public class TripBookingService implements ITripBookingService {

	@Override
	public TripBookingDTO addTripBooking(TripBookingDTO tripBooking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBookingDTO updateTripBooking(TripBookingDTO tripBooking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBookingDTO cancleTripBooking(Integer tripBookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBookingDTO> viewAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TripBookingDTO viewBookingByBookingId(Integer tripBookingId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBookingDTO> viewBookingByCustomerId(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBookingDTO> viewBookingByBookingStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBookingDTO> viewBookingByCabType(String cabType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBookingDTO> viewBookingsByDatewiseSortingOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TripBookingDTO> viewBookingsByCustomerBasedOnDates(Integer customerId, LocalDate fromDate,
			LocalDate toDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
