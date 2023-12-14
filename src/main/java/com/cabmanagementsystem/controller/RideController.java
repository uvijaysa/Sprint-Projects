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

import com.cabmanagementsystem.dto.RideDTO;
import com.cabmanagementsystem.service.RideService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ride")
public class RideController {
	@Autowired
	private RideService rService;

	@PostMapping("/add")
	public RideDTO addRide(@Valid @RequestBody RideDTO add) {
		return rService.addRide(add);
	}

	@PutMapping("/update")
	public RideDTO updateRide(@Valid @RequestBody RideDTO ride) {
		return rService.updateRide(ride);
	}

	@GetMapping("/cancelRide/{rideId}")
	public RideDTO cancelRide(@PathVariable int rideId) {
		return rService.cancelRide(rideId);
	}

	@GetMapping("/getAll")
	public List<RideDTO> viewAllRide() {
		return rService.viewAllRide();
	}

	@GetMapping("/viewRidesByCustomer/{customerId}")
	public List<RideDTO> viewRideByCustomerId(@PathVariable int customerId) {
		return rService.viewRideByCustomerId(customerId);
	}

	@GetMapping("/viewRidesByDriver/{driverId}")
	public List<RideDTO> viewRideByDriverId(@PathVariable int driverId) {
		return rService.viewRideByDriverId(driverId);
	}

	@GetMapping("/viewRidesByCab/{cabId}")
	public List<RideDTO> viewRidesByCabId(@PathVariable int cabId) {
		return rService.viewRideByCabId(cabId);
	}

	@GetMapping("/viewRidesByStatus/{status}")
	public List<RideDTO> viewRidesByStatus(@PathVariable String status) {
		return rService.viewRideByStatus(status);
	}

	@GetMapping("/viewRidesByDate/{date}")
	public List<RideDTO> viewRidesByDate(@PathVariable String date) {
		return rService.viewRideByDate(LocalDate.parse(date));
	}

}