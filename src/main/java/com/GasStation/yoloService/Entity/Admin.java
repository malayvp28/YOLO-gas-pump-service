package com.GasStation.yoloService.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Admin {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long admin_id;
	
	
	private String name;
	

	private String username;
	
	@Column(unique=true)
	private String phone_number;
	
	
	private String password;
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(String name, String username, String phoneNumber, String password) {
		super();
		
		this.name = name;
		this.username = username;
		this.phone_number = phoneNumber;
		this.password = password;
		
	}


	public Long getAdmin_id() {
		return admin_id;
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


	public String getPhoneNumber() {
		return phone_number;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	

}
