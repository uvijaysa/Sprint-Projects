package com.cabmanagementsystem.dto;

public class AdminDTO extends UserDTO{

	private String adminName;

	public AdminDTO() {
		super();
	}
	public AdminDTO(int userId, String userName, String password, String address, String mobileNumber, String email,
			String roles, String adminName) {
		super(userId, userName, password, address, mobileNumber, email, roles);
		this.adminName = adminName;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return "AdminDTO [adminName=" + adminName + "]";
	}
	
	
}
