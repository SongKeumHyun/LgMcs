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
import com.lgcns.mcs.entity.Zone;
import com.lgcns.mcs.services.EquipmentService;
import com.lgcns.mcs.services.ILgMcsService.ServiceType;
import com.lgcns.mcs.services.McsServiceFactory;
import com.lgcns.mcs.services.UnitService;




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
			
        Equipment eqp1 = new Equipment();
        eqp1.setEquipmentId("H2STK01");
        eqp1.setEquipmentName("H2STK01");
        eqp1=  eqpServivice.save(eqp1);
        
        
        UnitService unitService = (UnitService)mcsServiceFactory.getService(ServiceType.UnitService);
        
        Zone zone = new Zone();
        zone.setEquipmentId("EQP1");
        zone.setUnitId("unit01");
        zone.setZoneName("Zone01");
        
        unitService.save(zone);
        
        

		
	}


}
