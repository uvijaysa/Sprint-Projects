package com.cabmanagementsystem.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabmanagementsystem.dto.RideDTO;
import com.cabmanagementsystem.entity.Ride;
import com.cabmanagementsystem.exception.RideNotFoundException;
import com.cabmanagementsystem.repository.RideRepository;
import com.cabmanagementsystem.util.RideStatus;
@Service
public class RideService implements IRideService {
    @Autowired
    private RideRepository rRepo;
    @Autowired
    private ModelMapper modelMapper;
    
    //Method for adding the ride data	
    @Override
    public RideDTO addRide(RideDTO rideDTO) {
        Ride rideDAO = modelMapper.map(rideDTO, Ride.class); // DTO to DAO mapping conversion
        rideDAO = rRepo.save(rideDAO);
        RideDTO rideDTO1 = modelMapper.map(rideDAO, RideDTO.class); // DAO to DTO mapping conversion
        return rideDTO1;
    }
    
    //Method for update the ride data
    @Override
    public RideDTO updateRide(RideDTO rideDTO) {
        Ride rideDAO = modelMapper.map(rideDTO, Ride.class);
        if (rRepo.existsById(rideDAO.getRideId())) {
        	
            rideDAO = rRepo.save(rideDAO);
        }else
        	 throw new RideNotFoundException("Ride Id doesn't exists");
        RideDTO rideDTO1 = modelMapper.map(rideDAO, RideDTO.class);
        return rideDTO1;
    }
    
    //Method for cancel the ride
    @Override
    public RideDTO cancelRide(int rideId) {
        Optional<Ride> ride= rRepo.findById(rideId);
        Ride rideDAO ;
        if(ride.isEmpty())
        	  throw new  RideNotFoundException("Ride Id doesn't exists");
        else
        	 rideDAO = ride.get();
        rideDAO.setRideStatus(RideStatus.CANCELED);
        rideDAO = rRepo.save(rideDAO);
        
        RideDTO rideDTO1 = modelMapper.map(rideDAO, RideDTO.class);
        return rideDTO1;
    }
    
    //Method for getting the list of all rides
    @Override
    public List < RideDTO > viewAllRide() {
        List < Ride > rideDAOList = rRepo.findAll();
        List < RideDTO > rideDTOList = new ArrayList < > ();
        RideDTO rideDTO;
        for (int i = 0; i < rideDAOList.size(); i++) {
            rideDTO = modelMapper.map(rideDAOList.get(i), RideDTO.class);
            rideDTOList.add(rideDTO);
        }
        return rideDTOList;
    }
    
    //Method for getting the list of rides by using customerId
    @Override
    public List < RideDTO > viewRideByCustomerId(int customerId) {
        List < Ride > rideDAOList = rRepo.findAllByCustomerId(customerId);
        if(rideDAOList.size() == 0)
        	  throw new RideNotFoundException("Ride details not found for the given customer id ");
        List < RideDTO > rideDTOList = new ArrayList < > ();
        for (Ride rideDAO: rideDAOList) {
            rideDTOList.add(modelMapper.map(rideDAO, RideDTO.class));
        }
        return rideDTOList;
    }
    
    //Method for getting the list of rides by using the cabId 
    @Override
    public List < RideDTO > viewRideByCabId(int cabId) {
        List < Ride > rideDAOList = rRepo.findAllByCabId(cabId);
        if(rideDAOList.size() == 0)
      	  throw new RideNotFoundException("Ride details not found for the given cab id ");
        List < RideDTO > rideDTOList = new ArrayList < > ();
        for (Ride rideDAO: rideDAOList) {
            rideDTOList.add(modelMapper.map(rideDAO, RideDTO.class));
        }
        return rideDTOList;
    }
    //Method for getting the list of rides by using the ride status
    @Override
    public List < RideDTO > viewRideByStatus(String status) {
        List < Ride > rideDAOList = rRepo.findAllByRideStatus(RideStatus.valueOf(status));
        if(rideDAOList.size() == 0)
        	  throw new RideNotFoundException("Ride details not found for the given status ");
        List < RideDTO > rideDTOList = new ArrayList < > ();
        for (Ride rideDAO: rideDAOList) {
            rideDTOList.add(modelMapper.map(rideDAO, RideDTO.class));
        }
        return rideDTOList;
    }
    
    //Method for getting the ride date
    @Override
    public List < RideDTO > viewRideByDate(LocalDate date) {
        List < Ride > rideDAOList = rRepo.findAllByDate(date);
        if(rideDAOList.size() == 0)
        	  throw new RideNotFoundException("Ride details not found for the given date ");
        List < RideDTO > rideDTOList = new ArrayList < > ();
        for (Ride rideDAO: rideDAOList) {
            rideDTOList.add(modelMapper.map(rideDAO, RideDTO.class));
        }
        return rideDTOList;
    }
    
    //Method for getting the list of rides by driverId
    @Override
    public List < RideDTO > viewRideByDriverId(int driverId) {
        List < Ride > rideDAOList = rRepo.findAllByDriverId(driverId);
        if(rideDAOList.size() == 0)
        	  throw new RideNotFoundException("Ride details not found for the given driver id ");
        List < RideDTO > rideDTOList = new ArrayList < > ();
        for (Ride rideDAO: rideDAOList) {
            rideDTOList.add(modelMapper.map(rideDAO, RideDTO.class));
        }
        return rideDTOList;
    }
    
}