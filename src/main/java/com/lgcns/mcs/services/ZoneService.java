
package com.lgcns.mcs.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.entity.ZonePk;
import com.lgcns.mcs.repository.IZoneRepository;
import lombok.ToString;

@Service
@ToString
public class ZoneService implements ILgMcsService{
	
	private final Logger logger = LoggerFactory.getLogger(ZoneService.class);
	
	@Autowired
	private final IZoneRepository zoneRepository = null;
	
	
	public Zone getZone(String equipmentId,String zoneId)
	{
		
		return zoneRepository.findOneByEquipmentIdAndZoneId(equipmentId, zoneId);
		
	}
	
	public Zone save(Zone zone)
	{
		logger.info("Zone Saved Info :" + zone.toString());
		return zoneRepository.save(zone);
		
	}
	
	public void delete(Zone zone)
	{
		logger.info("Zone Deleted Info :" + zone.toString());
		zoneRepository.delete(zone);
	}
	
	public List<Zone> getZonesByEquipmentId(String equipmentId)
	{
		return zoneRepository.findAllByEquipmentId(equipmentId);
		
	}
	
	public long getZoneCountByEquipment(String equipmentId)
	{
		return zoneRepository.countZoneIdByEquipmentId(equipmentId);
		
	}
	
	public boolean exsitZoneByEquipmentIdAndZoneId(String equipmentId, String zoneId)
	{
		return zoneRepository.existsZoneIdByEquipmentIdAndZoneId(equipmentId,"");
	}
	
	public List<String> getZoneIdsByEquipmentId(String equipmentId)
	{
		return zoneRepository.findAllZoneIdByEquipmentId(equipmentId);
	}
	
	
	public void RemoveZone(String equipmentId, String zoneId)
	{
		logger.info("Zone을 삭제하였습니다." + (new ZonePk(equipmentId,zoneId)).toString());
		zoneRepository.deleteById(new ZonePk(equipmentId,zoneId));
	}
	

	
	
	


	@Override
	public ServiceType getServiceTeye() {

		return ServiceType.ZoneService;
	}

}
