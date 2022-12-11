package com.lgcns.mcs;


import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.entity.Equipment;
import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.services.EquipmentService;
import com.lgcns.mcs.services.ILgMcsService.ServiceType;
import com.lgcns.mcs.services.McsServiceFactory;
import com.lgcns.mcs.services.ShelfService;
import com.lgcns.mcs.services.ZoneService;



@Component
@Transactional
public class LgMcsApplicationRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(LgMcsApplicationRunner.class);
	
	@Autowired
	private final McsServiceFactory mcsServiceFactory = null;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info("MCS Application Runner 실행"	);
		
		EquipmentService eqpServivice = (EquipmentService)mcsServiceFactory.getService(ServiceType.EquipmentService);
		ZoneService zoneService =  (ZoneService)mcsServiceFactory.getService(ServiceType.ZoneService);
		ShelfService shelfService =  (ShelfService)mcsServiceFactory.getService(ServiceType.ShelfServe);
		
        Equipment eqp1 = new Equipment();
        eqp1.setEquipmentId("H2STK01");
        eqp1.setEquipmentName("H2STK01");
        eqp1=  eqpServivice.save(eqp1);
        
        Zone zone1 = new Zone();
        zone1.setEquipmentId(eqp1.getEquipmentId());
        zone1.setZoneId("DZONE01");
        zone1.setZoneName(zone1.getZoneId());
        
        
        
        Shelf shelf1 = new Shelf(eqp1.getEquipmentId(),"20101",zone1.getZoneName());
        Shelf shelf2 = new Shelf(eqp1.getEquipmentId(),"20102",zone1.getZoneName());
        shelfService.save(shelf1);
        shelfService.save(shelf2);
        zone1.addShelf(shelf1);
        zone1.addShelf(shelf2);
        
        zone1 = zoneService.save(zone1);
        zone1 = zoneService.getZone(eqp1.getEquipmentId(), zone1.getZoneId());
        
		logger.info("==================> 가져온 ZONE" + zone1.toString()	);
        
		
		
		for (Shelf shelf : zone1.getShelfs()) {
			logger.info("가져온 Zone의 Shlef는 " + shelf.toString());
		}

		
		//carrierRepoistory.findAll().forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        
        
        

        
		

	


		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
