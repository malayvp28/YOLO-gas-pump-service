package com.GasStation.yoloService.Entity;

import javax.persistence.*;

@Entity
@Table
public class UpdateDate {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	   
	
	private String date;

	public UpdateDate(String date) {
		super();
		this.date = date;
	}

	public UpdateDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

}
