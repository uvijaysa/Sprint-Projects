
package com.cabmanagementsystem.repository;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.cabmanagementsystem.entity.Driver;
 
public interface DriverRepository extends JpaRepository<Driver,Integer> {

	public List<Driver> findAllByDriverAvailabilityTrue();

 
}
