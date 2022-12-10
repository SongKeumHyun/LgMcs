package com.lgcns.mcs;




import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.entity.Equipment;
import com.lgcns.mcs.services.EquipmentService;
import com.lgcns.mcs.services.ILgMcsService.ServiceType;
import com.lgcns.mcs.services.McsServiceFactory;



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
//		
//		ShelfService shelfService = (ShelfService)mcsServiceFactory.getService(ServiceType.ShelfServe);
//		ZoneService zoneService = (ZoneService)mcsServiceFactory.getService(ServiceType.ZoneService);
//		EquipmentService equipmentService =  (EquipmentService)mcsServiceFactory.getService(ServiceType.EquipmentService);
//		
//		StockerSem sem = new StockerSem();
//		sem.setEquipmentId("OBJ01");
//		sem.setEquipmentName("STK0100");
//		
//		sem= equipmentService.save(sem);
//		
//		Zone zone1 = new Zone();
//		zone1.setZoneName("DZONE01");
//		zone1.setStockerSem(sem);
//		zone1 = zoneService.save(zone1);
//		
//		Zone zone2 = new Zone();
//		zone2.setZoneName("DZONE01");
//		zone2.setStockerSem(sem);
//		zone2 = zoneService.save(zone2);
		
        Equipment eqp1 = new Equipment();
        eqp1.setEquipmentId("EQP1");
        eqp1.setEquipmentName("H2STK01");
        eqpServivice.save(eqp1);
        
        
        
        Equipment eqp2 =  eqpServivice.getEquipmentByEquipmentName("H2STK01");
        
        
		logger.info("==================> 가�온 EQP" + eqp2.toString()	);
        
		


		


		
			
		
		
//		carrierRepoistory.findAll().forEach(System.out::println);
	


		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
