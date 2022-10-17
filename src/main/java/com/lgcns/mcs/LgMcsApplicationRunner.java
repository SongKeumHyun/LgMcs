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
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.services.CarrierService;
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
		
		Shelf shelf1 = new Shelf();
		shelf1.setShelfId("1");
		shelfService.save(shelf1);
		
		Shelf shelf2 = new Shelf();
		shelf2.setShelfId("2");
		shelfService.save(shelf2);
		
		Zone zone = new Zone();
		
		zone.setZoneName("HZONE");
		zoneService.save(zone);
		
		shelf1.setZone(zone);
		shelfService.save(shelf1);
		
		
		logger.info("가져온 Zone 이름은" + shelf1.getZone().getZoneName());
		
		
		
		
//		carrierRepoistory.findAll().forEach(System.out::println);
	


		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
