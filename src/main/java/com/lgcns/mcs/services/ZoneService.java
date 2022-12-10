
package com.lgcns.mcs.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.repository.IZoneRepository;
import lombok.ToString;

@Service
@ToString
public class ZoneService implements ILgMcsService{
	
	private final Logger logger = LoggerFactory.getLogger(ZoneService.class);
	
	@Autowired
	private final IZoneRepository zoneRepository = null;
	
	
	
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
	
	
	


	@Override
	public ServiceType getServiceTeye() {

		return ServiceType.ZoneService;
	}

}
