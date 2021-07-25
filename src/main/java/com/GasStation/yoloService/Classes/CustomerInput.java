package com.GasStation.yoloService.Classes;

import com.GasStation.yoloService.Entity.Customer;

public class CustomerInput {
	
private String admin;
private String franchise;
private String employee;
private Customer c;
public String getAdmin() {
	return admin;
}
public void setAdmin(String admin) {
	this.admin = admin;
}
public String getFranchise() {
	return franchise;
}
public void setFranchise(String franchise) {
	this.franchise = franchise;
}
public String getEmployee() {
	return employee;
}
public void setEmployee(String employee) {
	this.employee = employee;
}
public Customer getC() {
	return c;
}
public void setC(Customer c) {
	this.c = c;
}
public CustomerInput() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerInput(String admin, String franchise, String employee, Customer c) {
	super();
	this.admin = admin;
	this.franchise = franchise;
	this.employee = employee;
	this.c = c;
}
@Override
public String toString() {
	return "CustomerInput [admin=" + admin + ", franchise=" + franchise + ", employee=" + employee + ", c=" + c + "]";
}




}
