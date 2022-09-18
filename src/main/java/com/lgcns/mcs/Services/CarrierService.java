package com.lgcns.mcs.Services;

import org.springframework.stereotype.Service;

import com.lgcns.mcs.interfaces.ILgService;

@Service
public class CarrierService implements ILgService {
	
	
	public String getCarrier(String carrierId)
	{
		return carrierId;
		
	}

}
