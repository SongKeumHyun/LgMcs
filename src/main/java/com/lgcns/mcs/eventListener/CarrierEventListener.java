/**
 * 
 */
package com.lgcns.mcs.eventListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.entity.Carrier;
import com.lgcns.mcs.event.CarrierEvent;

/**
 * @author kumh2
 *
 */
@Component
public class CarrierEventListener implements ApplicationListener<CarrierEvent>{

	private static final Logger logger = LoggerFactory.getLogger(CarrierEventListener.class);
	
	@Override
	public void onApplicationEvent(CarrierEvent event) {
		// TODO Auto-generated method stub
		logger.info("이벤트 수신~~~~~~");
		
		
	}



}
