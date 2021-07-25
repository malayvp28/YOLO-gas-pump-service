package com.GasStation.yoloService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GasStation.yoloService.Entity.Franchise;
import com.GasStation.yoloService.Entity.PublicQuery;

@Repository
public interface QueryRepo extends JpaRepository<PublicQuery,Long>{
	@Query(value = "from PublicQuery where id = ?1 ")
	public PublicQuery queryById(Long s);
}
