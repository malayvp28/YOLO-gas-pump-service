package com.GasStation.yoloService.Classes;

import javax.persistence.Column;

public class AdminLogin {

	private String phoneNumber;
	private String password;
	public AdminLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminLogin(String phoneNumber, String password) {
		super();
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
