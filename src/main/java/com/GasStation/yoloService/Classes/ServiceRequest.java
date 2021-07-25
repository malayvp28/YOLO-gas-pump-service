package com.GasStation.yoloService.Classes;

public class ServiceRequest {
	private String expiryDate;
	private String serviceDate;
	private Long id;
	public ServiceRequest(String expiryDate, String serviceDate, Long id) {
		super();
		this.expiryDate = expiryDate;
		this.serviceDate = serviceDate;
		this.id = id;
	}
	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
