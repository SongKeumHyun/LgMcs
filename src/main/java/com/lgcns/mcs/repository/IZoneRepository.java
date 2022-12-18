package com.lgcns.mcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.entity.ZonePk;

public interface IZoneRepository extends JpaRepository<Zone, ZonePk>{
	
	Zone findOneByEquipmentIdAndZoneId(String equipmentId, String zoneId);
	
	List<Zone> findAllByEquipmentId(String equipmentId);
	
	long  countZoneIdByEquipmentId(String equipmentId);
	
	boolean existsZoneIdByEquipmentIdAndZoneId(String equipmentId, String zondId);
	
	@Query(value = " select zoneId from Zone  where equipmentId = :equipmentId")
	List<String> findAllZoneIdByEquipmentId(@Param("equipmentId") String equipmentId);
	
	


	
	
	

}
