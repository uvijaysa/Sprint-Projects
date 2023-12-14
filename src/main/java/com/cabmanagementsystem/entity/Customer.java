package com.cabmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="Customer")
public class Customer extends User {
	@NotBlank(message="Customer name should not be blank")
	private String customerName;

public Customer()
{
  super();	
}
	public Customer(int userId, String userName, String password, String address, String mobileNumber, String email,
			String roles,String customerName) {
		
		
		super(userId, userName, password,  address, mobileNumber, email,roles);
		this.customerName = customerName;
	}
	
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + "]";
	}

}
