package com.cabmanagementsystem.dto;

public class CustomerDTO extends UserDTO{
	
	private String customerName;

	public CustomerDTO() {
		super();
	}
	public CustomerDTO(int userId, String userName, String password, String address, String mobileNumber, String email,
			String roles, String customerName) {
		super(userId, userName, password, address, mobileNumber, email, roles);
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + "]";
	}			

}
