/**
 * 
 */
package com.lgcns.mcs.eventHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.lgcns.mcs.interfaces.EventListener;

/**
 * @author kumh2
 *
 */

public class CarrierEventLisner implements EventListener {

	private static final Logger logger = LoggerFactory.getLogger(CarrierEventLisner.class);
	
	public CarrierEventLisner() {
		logger.debug(CarrierEventLisner.class.toString() + "생성");
		EventHandler.addListener(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onEvent(String event) {
		// TODO Auto-generated method stub
		logger.info("Carrier Event 발생");
		
	}

		


}
