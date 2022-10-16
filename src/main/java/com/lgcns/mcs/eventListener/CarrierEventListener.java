/**
 * 
 */
package com.lgcns.mcs.eventListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.event.CarrierEvent;


/**
*
* @Package_name
* com.lgcns.mcs.eventListener
* @file_name
* CarrierEventListener.java
* @Date
* 2022. 10. 16.
* @EditHistory
*
* @Discript
*
*/
@Component
public class CarrierEventListener implements ApplicationListener<CarrierEvent>{

	private static final Logger logger = LoggerFactory.getLogger(CarrierEventListener.class);
	
	@Override
	public void onApplicationEvent(CarrierEvent event) {
		// TODO Auto-generated method stub
		logger.info("--->> [Event Revive] Carrier Event Info :" + event.toString());
		
		
	}



}
