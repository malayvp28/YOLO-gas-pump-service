package com.GasStation.yoloService.Classes;

import javax.persistence.Column;

public class AdminResponse {
	
    private Long admin_id;
	
	
	private String name;
	

	private String username;
	
	
	private String phone_number;
	
	private String message;


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	


	public Long getAdmin_id() {
		return admin_id;
	}


	public AdminResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public AdminResponse(Long admin_id, String name, String username, String phone_number, String message) {
		super();
		this.admin_id = admin_id;
		this.name = name;
		this.username = username;
		this.phone_number = phone_number;
		this.message = message;
	}


	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

}
