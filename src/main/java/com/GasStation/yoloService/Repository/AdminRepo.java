package com.GasStation.yoloService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.GasStation.yoloService.Entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Long>{

	@Query(value = "from Admin where phone_number = ?1 ")
	public Admin adminByPhoneNumber(String s);
	
	@Query(value = "from Admin where username = ?1 ")
	public Admin adminByUsername(String s);


}
