package com.GasStation.yoloService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GasStation.yoloService.Entity.*;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
	@Query(value = "from Employee where employee_id = ?1 ")
	public Employee employeeById(Long s);
	
	@Query(value = "from Employee where phone_number = ?1 ")
	public Employee employeeByPhoneNumber(String s);
	
	@Query(value = "from Employee where username = ?1 ")
	public Employee employeeByUsername(String s);
}
