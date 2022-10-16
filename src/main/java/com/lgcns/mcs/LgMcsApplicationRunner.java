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
import com.lgcns.mcs.services.CarrierService;
import com.lgcns.mcs.services.McsServiceFactory;
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
		
		CarrierService carrierService =  (CarrierService)mcsServiceFactory.getService(ServiceType.CarrierService);
		
		
		Carrier carrier = new Carrier();


		carrier.setCarrierId("TESTCST1");
		
		
		carrier.enventPublish();
		
		carrierService.save(carrier);
		
		
//		carrierRepoistory.findAll().forEach(System.out::println);
	


		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
