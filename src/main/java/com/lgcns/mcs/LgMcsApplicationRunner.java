package com.lgcns.mcs;




import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.entity.Equipment;
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.services.EquipmentService;
import com.lgcns.mcs.services.ILgMcsService.ServiceType;
import com.lgcns.mcs.services.McsServiceFactory;
import com.lgcns.mcs.services.ZoneService;



@Component
//@Transactional
public class LgMcsApplicationRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(LgMcsApplicationRunner.class);
	
	@Autowired
	private final McsServiceFactory mcsServiceFactory = null;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info("MCS Application Runner 실행"	);
		
		EquipmentService eqpServivice = (EquipmentService)mcsServiceFactory.getService(ServiceType.EquipmentService);
		ZoneService zoneService =  (ZoneService)mcsServiceFactory.getService(ServiceType.ZoneService);
		
        Equipment eqp1 = new Equipment();
        eqp1.setEquipmentId("EQP1");
        eqp1.setEquipmentName("H2STK01");
        eqp1=  eqpServivice.save(eqp1);
        
        Zone zone1 = new Zone();
        zone1.setEquipmentId(eqp1.getEquipmentId());
        zone1.setZoneId("DZONE01");
        zone1.setZoneName(zone1.getZoneId());
        zone1 = zoneService.save(zone1);
        
        
        
        
        
        
		logger.info("==================> 가져온 ZONE" + zone1.toString()	);
        
		
//		carrierRepoistory.findAll().forEach(System.out::println);
	


		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
