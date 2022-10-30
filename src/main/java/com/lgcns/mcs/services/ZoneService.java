/**
*
* @FileName
* ZoneService.java
* @Project
* LgMcs
* @Date
* 2022. 10. 17.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.repository.IZoneRepository;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
*
* @Package_name
* com.lgcns.mcs.services
* @file_name
* ZoneService.java
* @Date
* 2022. 10. 17.
* @EditHistory
*
* @Discript
*
*/
@Getter
@Setter
@Service
@ToString
public class ZoneService implements ILgMcsService {

	private static final Logger logger = LoggerFactory.getLogger(ZoneService.class);
	
	
	@Autowired
	private final IZoneRepository zoneRepository = null;

    public void save(Zone zone)
    {
    	try
    	{
    		zoneRepository.save(zone);
    		logger.info("zone가 저장 되었습니다." + zone.toString());
    	}catch (Exception e) {
			logger.error("zone ID  저장을 실패 하였습니다.",zone.toString());
		}
    	
    	
    }

	@Override
	public ServiceType getServiceTeye() {
		// TODO Auto-generated method stub
		return ServiceType.ZoneService;
	}


}
