package com.cabmanagementsystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Admin")
public class Admin extends User {
	@NotBlank(message = "Admin Name cannot be blank")
    private String adminName;
    // Default Constructor
    public Admin() {}
    // Constructor using fields
    public Admin(int userId, String userName, String password, String address, String mobileNumber, String email,
        String roles, String adminName) {
        super(userId, userName, password, address, mobileNumber, email, roles);
        this.adminName = adminName;
    }
    // Getters & Setters
    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    @Override
    public String toString() {
        return "Admin [adminName=" + adminName + "]";
    }
   
}