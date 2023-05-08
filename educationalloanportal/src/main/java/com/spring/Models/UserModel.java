package com.spring.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="user")
public class UserModel {
@Id
@Column(name="Email")
private int id;
private String Email;
private String Password;
private String Username;
private String MobileNumber;
private String UserRole;
private int LoanId;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getMobileNumber() {
	return MobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	MobileNumber = mobileNumber;
}
public String getUserRole() {
	return UserRole;
}
public void setUserRole(String userRole) {
	UserRole = userRole;
}
public int getLoanId() {
	return LoanId;
}
public void setLoanId(int loanId) {
	LoanId = loanId;
}
}
