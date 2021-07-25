package com.GasStation.yoloService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.GasStation.yoloService.Entity.Admin;
import com.GasStation.yoloService.Repository.AdminRepo;

@SpringBootApplication
public class YoloServiceApplication {
	

	


	
	public static void main(String[] args) {
		SpringApplication.run(YoloServiceApplication.class, args);
	}

}
