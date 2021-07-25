package com.GasStation.yoloService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GasStation.yoloService.Entity.*;

@Repository
public interface FranchiseRepo extends JpaRepository<Franchise,Long> {
	@Query(value = "from Franchise where franchise_id = ?1 ")
	public Franchise franchiseById(Long s);
}
