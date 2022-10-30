package com.lgcns.mcs;


import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.entity.Carrier;
import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.entity.StockerSem;
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.services.CarrierService;
import com.lgcns.mcs.services.EquipmentService;
import com.lgcns.mcs.services.McsServiceFactory;
import com.lgcns.mcs.services.ShelfService;
import com.lgcns.mcs.services.ZoneService;
import com.lgcns.mcs.services.ILgMcsService.ServiceType;



@Component
@Transactional
public class LgMcsApplicationRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(LgMcsApplicationRunner.class);
	
	@Autowired
	private final McsServiceFactory mcsServiceFactory = null;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info("MCS Application Runner 실행"	);
		
		//CarrierService carrierService =  (CarrierService)mcsServiceFactory.getService(ServiceType.CarrierService);
		
		ShelfService shelfService = (ShelfService)mcsServiceFactory.getService(ServiceType.ShelfServe);
		ZoneService zoneService = (ZoneService)mcsServiceFactory.getService(ServiceType.ZoneService);
		EquipmentService equipmentService =  (EquipmentService)mcsServiceFactory.getService(ServiceType.EquipmentService);
		
		StockerSem sem = new StockerSem();
		sem.setEquipmentId("OBJ01");
		sem.setEquipmentName("STK0100");
		
		sem= equipmentService.save(sem);
		
		logger.info("저장시킨 Eqp는?" + sem.toString());
		
		Zone zone = new Zone();
		zone.setZoneName("DZONE01");
		zoneService.save(zone);
		zone.setStockerSem(sem);
		
		Zone zone1 = new Zone();
		zone1.setZoneName("DZONE02");
		zone1.setStockerSem(sem);
		zoneService.save(zone1);
		
//		for(Zone z : sem.getZones())
//		{
//			logger.info("니가 저장한 Zone은" + z.toString());
//			
//		}
		
		


		


		
		

		logger.info("EQP와  Zone 만들어 졌나?"	);
		
		
		
//		carrierRepoistory.findAll().forEach(System.out::println);
	


		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
