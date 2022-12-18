package com.lgcns.mcs;


import java.util.List;

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
		
		logger.info("MCS Application Runner �행"	);
		
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
        zoneService.save(zone1);
                

        Zone zone2 = new Zone();
        zone2.setEquipmentId(eqp1.getEquipmentId());
        zone2.setZoneId("DZONE02");
        zone2.setZoneName(zone2.getZoneId());
        zoneService.save(zone2);

        
        Shelf shelf1 = new Shelf(eqp1.getEquipmentId(),"20101");
        shelf1.setZoneId(zone1.getZoneId());
        shelfService.save(shelf1);


        
        Shelf shelf2 = new Shelf(eqp1.getEquipmentId(),"20102");
        shelf2.setZoneId(zone2.getZoneId());
        shelfService.save(shelf2);
        
        
        List<Zone> zones =  zoneService.getZonesByEquipmentId("H2STK01");
        

        
        for (Zone zone : zones) {
        	logger.info("==================> 가져온 ZONE" + zone.toString()	);
		}
        
        logger.info("==================> Zone Count : " + zoneService.getZoneCountByEquipment("H2STK01")	);
        
        logger.info("==================> Zone exist : " + (zoneService.exsitZoneByEquipmentIdAndZoneId("H2STK01", "DZONE01") == true ? "TRUE" : "FALSE")	);
        
        List<String> zoneIds = zoneService.getZoneIdsByEquipmentId("H2STK01");
        
        for (String zoneId : zoneIds) {
        	logger.info("==================> 가져온 ZONE ID + zoneId" + zoneId	);
		}
		
	}


}
