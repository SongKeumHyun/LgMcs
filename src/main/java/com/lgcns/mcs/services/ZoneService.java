
package com.lgcns.mcs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.repository.IZoneRepository;
import lombok.ToString;

@Service
@ToString
public class ZoneService implements ILgMcsService{
	
	@Autowired
	private final IZoneRepository zoneRepository = null;
	
	
	
	public Zone save(Zone zone)
	{
		return zoneRepository.save(zone);
		
	}
	
	
	


	@Override
	public ServiceType getServiceTeye() {

		return ServiceType.ZoneService;
	}

}
