/**
 * 
 */
package com.lgcns.mcs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

import com.lgcns.mcs.eventListener.CarrierEventListener;

/**
 * @author kumh2
 *
 */
//@Configuration
public class LgMcsApplicationRunnerConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(LgMcsApplicationRunnerConfig.class);
	@Bean
	public CarrierEventListener carrierEventListener()
	{
		logger.info("이벤트리스너 생성됨");
		return new CarrierEventListener();
	}

}
