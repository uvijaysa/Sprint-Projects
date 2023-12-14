package com.cabmanagementsystem.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabmanagementsystem.dto.DriverDTO;
import com.cabmanagementsystem.entity.Driver;
import com.cabmanagementsystem.exception.DriverNotFoundException;
import com.cabmanagementsystem.repository.DriverRepository;

@Service
public class DriverService implements IDriverService {
    @Autowired
    private DriverRepository driverRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public DriverDTO addDriver(DriverDTO driverDTO) {
        //DAO To DTO
        Driver DriverDAO = modelMapper.map(driverDTO, Driver.class);
        DriverDAO = driverRepo.save(DriverDAO);
        //DTO To DAO
        DriverDTO DriverDTO1 = modelMapper.map(DriverDAO, DriverDTO.class);
        return DriverDTO1;
    }
    @Override
    public DriverDTO updateDriver(DriverDTO driverDTO) {
        Driver DriverDAO = modelMapper.map(driverDTO, Driver.class);
        if (driverRepo.existsById(DriverDAO.getUserId())) {
        	
            DriverDAO = driverRepo.save(DriverDAO);
        }
        else
        	throw new DriverNotFoundException("Driver Id doesn't exists");
        DriverDTO DriverDTO1 = modelMapper.map(DriverDAO, DriverDTO.class);
        return DriverDTO1;
    }
    @Override
    public List < DriverDTO > viewDrivers() {
        List < Driver > driverDAOList = driverRepo.findAll();
        List < DriverDTO > driverDTOList = new ArrayList < > ();
        DriverDTO driverDTO;
        for (int i = 0; i < driverDAOList.size(); i++) {
            driverDTO = modelMapper.map(driverDAOList.get(i), DriverDTO.class);
            driverDTOList.add(driverDTO);
        }
        return driverDTOList;
    }
    @Override
    public DriverDTO viewDriverById(Integer driverId) {
       Optional< Driver> driverDAO = driverRepo.findById(driverId);
       if(driverDAO.isEmpty())
    	    throw new DriverNotFoundException("Driver id doesn't exists");
       
        DriverDTO DriverDTO1 = modelMapper.map(driverDAO.get(), DriverDTO.class);
        return DriverDTO1;
    }
    @Override
    public List < DriverDTO > viewDriverByAvailability() {
        List < Driver > DriverDAO = driverRepo.findAllByDriverAvailabilityTrue();
        List < DriverDTO > DriverDTOList = new ArrayList < > ();
        for (int i = 0; i < DriverDAO.size(); i++) {
            DriverDTOList.add(modelMapper.map(DriverDAO.get(i), DriverDTO.class));
        }
        return DriverDTOList;
    }
}