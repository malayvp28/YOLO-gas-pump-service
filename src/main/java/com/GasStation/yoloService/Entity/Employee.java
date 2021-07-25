package com.GasStation.yoloService.Entity;

import javax.persistence.*;

@Entity
@Table
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;
	
	
	private String name;
	
	
	private String username;
	
	
	private String password;
	
    
	
	private String phone_number;



	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee( String name, String username, String password, String phone_number) {
		super();
		
		this.name = name;
		this.username = username;
		this.password = password;
		this.phone_number = phone_number;
		
	}



	public Long getEmployee_id() {
		return employee_id;
	}



	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
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



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getPhone_number() {
		return phone_number;
	}



	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	
	

	

}
