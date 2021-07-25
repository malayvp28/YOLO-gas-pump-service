package com.GasStation.yoloService.Entity;
import java.util.*;
import javax.persistence.*;

@Entity
@Table
public class Franchise {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long franchise_id;
	
	
	private String name;
	
	
	private String username;
	
	
	private String password;
	
	
	private String address;

	
	private String phone_number;
	
	@OneToMany
	private List<Employee> employee;

	public Long getFranchise_id() {
		return franchise_id;
	}

	public void setFranchise_id(Long franchise_id) {
		this.franchise_id = franchise_id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phone_number;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Franchise(String name, String username, String password, String address, String phoneNumber,
			List<Employee> employee) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone_number = phoneNumber;
		this.employee = employee;
	}

	public Franchise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
