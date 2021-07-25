package com.GasStation.yoloService.Classes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.GasStation.yoloService.Entity.Customer;
import com.GasStation.yoloService.Entity.Dealer;
import com.GasStation.yoloService.Entity.Employee;
import com.GasStation.yoloService.Entity.Franchise;
import com.GasStation.yoloService.Entity.UpdateDate;

public class CustomerResponse {



    
   private Customer customer; 
    
    
    private Dealer dealer;
    

    private Employee employee;
    

    private Franchise franchise;


	public CustomerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerResponse(Customer customer, Dealer dealer, Employee employee, Franchise franchise) {
		super();
		this.customer = customer;
		this.dealer = dealer;
		this.employee = employee;
		this.franchise = franchise;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Dealer getDealer() {
		return dealer;
	}


	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Franchise getFranchise() {
		return franchise;
	}


	public void setFranchise(Franchise franchise) {
		this.franchise = franchise;
	}
    
    
 
    
}
