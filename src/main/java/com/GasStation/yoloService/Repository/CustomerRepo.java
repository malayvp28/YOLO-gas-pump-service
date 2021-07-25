package com.GasStation.yoloService.Repository;

import com.GasStation.yoloService.Entity.Admin;
import com.GasStation.yoloService.Entity.Customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer,Long> {
	@Query(value = "from Customer where car_number = ?1 ")
	public Customer customerByCarNumber(String s);
	
	@Query(value = "from Customer where customer_id = ?1 ")
	public Customer customerById(Long s);
	

}
