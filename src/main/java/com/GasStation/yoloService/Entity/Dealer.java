package com.GasStation.yoloService.Entity;

import javax.persistence.*;

@Entity
@Table
public class Dealer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dealer_id;
	
	
	private String name;
	
	
	private String password;
	
	
	private String username;
	
	
	private String phone_number;
	
	
	private String address;

	

}
