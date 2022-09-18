package com.lgcns.mcs.Services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class ManagerFactory {

	private static final Logger logger = LoggerFactory.getLogger(ManagerFactory.class);
	
	
	public ManagerFactory(CarrierService carrierService) {
		logger.info("메니져에 Carreir Service 주입");
		this.carrierService = carrierService;
	}


	
	@Autowired
	CarrierService carrierService;
	
	public CarrierService getCarrierService()
	{
		return this.carrierService;
	}
	
}
