package com.cabmanagementsystem.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cabmanagementsystem.dto.TripBookingDTO;
import com.cabmanagementsystem.service.TripBookingService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tripBooking")
public class TripBookingController {

	@Autowired
	
	private TripBookingService tservice;



	@PostMapping("/add")
	public TripBookingDTO addTripBooking(@Valid @RequestBody TripBookingDTO to) {

		return tservice.addTripBooking(to);
	}

	@GetMapping("/view")
	public List<TripBookingDTO> viewTripBooking() {

		return tservice.viewAllBookings();
	}

	@GetMapping("/viewBookingId/{id}")
	public TripBookingDTO viewBookingByBookingId(@PathVariable int id) {
		return tservice.viewBookingByBookingId(id);
	}

	@GetMapping("/viewBookingStatus/{status}")
	public List<TripBookingDTO> viewBookingByBookingStatus(@PathVariable String status) {
		return tservice.viewBookingByBookingStatus(status);
	}

	@GetMapping("/viewOrderByDate")
	public List<TripBookingDTO> viewBookingsByDatewiseSortingOrder() {
		return tservice.viewBookingsByDatewiseSortingOrder();
	}

	@GetMapping("/cancelTrip/{id}")
	public TripBookingDTO cancleTripBooking(@PathVariable int id) {
		return tservice.cancleTripBooking(id);
	}

	@GetMapping("/viewCustomerId/{customerId}")
	public List<TripBookingDTO> viewBookingByCustomerId(@PathVariable Integer customerId) {
		return tservice.viewBookingByCustomerId(customerId);
	}

	@GetMapping("/viewBookingsByDates/{customerId}/{fromDate}/{toDate}")
	public List<TripBookingDTO> viewBookingsByCustomerBasedOnDates(@PathVariable Integer customerId,
			@PathVariable LocalDate fromDate, @PathVariable LocalDate toDate) {

		return tservice.viewBookingsByCustomerBasedOnDates(customerId, fromDate, toDate);

	}

	@GetMapping("/viewtripBookingByCabType/{cabType}")
	public List<TripBookingDTO> viewBookingByCabType(@PathVariable String cabType) {
		return tservice.viewBookingByCabType(cabType);
	}

	@PutMapping("/updaterip")
	public TripBookingDTO updateTripBooking(@Valid @RequestBody TripBookingDTO tripBookingDTO) {
		return tservice.updateTripBooking(tripBookingDTO);
	}

}
