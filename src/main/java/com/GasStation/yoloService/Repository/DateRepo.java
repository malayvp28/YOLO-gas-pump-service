package com.GasStation.yoloService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GasStation.yoloService.Entity.UpdateDate;

@Repository
public interface DateRepo extends JpaRepository<UpdateDate,Long>{

}
