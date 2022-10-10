package com.lgcns.mcs.schedulers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class ScheduleService {
	
	private static final Logger logger = LoggerFactory.getLogger(ScheduleService.class);
	
	
	
	@Scheduled(fixedDelay = 100000)
    public void scheduleFixedDelayTask() throws InterruptedException 
	{
		logger.info("------------- Scheduling ------------");
		

		
        Thread.sleep(5000);
    }


}
