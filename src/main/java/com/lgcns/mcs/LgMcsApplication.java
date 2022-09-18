package com.lgcns.mcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@EnableScheduling 
@EnableAutoConfiguration
@SpringBootApplication
public class LgMcsApplication {
	private static final Logger logger = LoggerFactory.getLogger(LgMcsApplication.class);

	public static void main(String[] args) {
		logger.info("------------------>     Start...... LG MCS");
		SpringApplication.run(LgMcsApplication.class, args);
		logger.info("<------------------     Terminated...... LG MCS");
	}

}
