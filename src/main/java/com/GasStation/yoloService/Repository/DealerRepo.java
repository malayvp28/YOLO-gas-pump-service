package com.GasStation.yoloService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GasStation.yoloService.Entity.*;

@Repository
public interface DealerRepo extends JpaRepository<Dealer,Long> {
	@Query(value = "from Dealer where dealer_id = ?1 ")
	public Dealer dealerById(Long s);
}
