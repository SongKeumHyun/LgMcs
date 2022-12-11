package com.lgcns.mcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.entity.ZonePk;

public interface IZoneRepository extends JpaRepository<Zone, ZonePk>{
	
	Zone findOneByEquipmentIdAndZoneId(String equipmentId, String zoneId);
	
	
	
	

}
