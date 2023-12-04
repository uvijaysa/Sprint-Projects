package com.cabmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer extends User {
	
	private String customerName;

	public Customer(String customerName) {
		super();
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
