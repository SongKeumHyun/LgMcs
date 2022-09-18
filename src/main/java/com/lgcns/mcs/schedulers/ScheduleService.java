package com.lgcns.mcs.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.Services.ManagerFactory;

@Component
public class ScheduleService {
	
	private static final Logger logger = LoggerFactory.getLogger(ScheduleService.class);
	
	ManagerFactory manager;
	
	
	
	
	public ScheduleService(ManagerFactory manager) {
		this.manager = manager;
	}


	
	

	
	
	@Scheduled(fixedDelay = 10000)
    public void scheduleFixedDelayTask() throws InterruptedException 
	{
		logger.info("------------- Scheduling ------------");
		
		String carrierId = manager.getCarrierService().getCarrier("TEST Carrier");
		
		logger.info(" 가져온 Carreir ID " + carrierId);
		
		
        Thread.sleep(5000);
    }


}
