package com.GasStation.yoloService.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class PublicQuery {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private  String phone_number;
	
	private String query_status;
	

	
	
	private String query;

	private String date;

	public PublicQuery() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PublicQuery(String name, String phone_number, String query_status, String query, String date) {
		super();
		this.name = name;
		this.phone_number = phone_number;
		this.query_status = query_status;
		this.query = query;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getQuery_status() {
		return query_status;
	}

	public void setQuery_status(String query_status) {
		this.query_status = query_status;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
		
}
