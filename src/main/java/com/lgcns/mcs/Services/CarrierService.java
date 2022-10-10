package com.lgcns.mcs.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.entity.Carrier;
import com.lgcns.mcs.repository.ICarrierRepository;


@Service
public class CarrierService implements ILgMcsService {
	
	private static final Logger logger = LoggerFactory.getLogger(CarrierService.class);
	
	private static final String className = "CarrierService";
	
	@Autowired
	private final ICarrierRepository carrierRepository = null;
	
    @SuppressWarnings("deprecation")
	public Carrier getCarrier(String carrierId)
	{
    	try
    	{
    		return carrierRepository.getById(carrierId);
		
    	}catch ( javax.persistence.EntityNotFoundException e) {
    		logger.error(carrierId + "찾는 Carrier ID가 없어서 Null을 리턴 하였습니다.");
			return null;
		}
	}
    
    public void save(Carrier carrier)
    {
    	try
    	{
    		carrierRepository.save(carrier);
    		logger.info("Carrier가 저장 되었습니다." + carrier.toString());
    	}catch (Exception e) {
			logger.error("Carrier ID {0}에 저장을 실패 하였습니다.",carrier.toString());
		}
    	
    	
    }

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return className;
    }
    
    
 
	@Override
	public ServiceType getServiceTeye() {
		return ServiceType.CarrierService;
	}

}
