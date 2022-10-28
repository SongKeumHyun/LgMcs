/**
*
* @FileName
* EquipmentService.java
* @Project
* LgMcs
* @Date
* 2022. 10. 28.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.entity.StockerSem;
import com.lgcns.mcs.repository.IStockerSemRepository;

import lombok.ToString;

/**
*
* @Package_name
* com.lgcns.mcs.services
* @file_name
* EquipmentService.java
* @Date
* 2022. 10. 28.
* @EditHistory
*
* @Discript
*
*/
@Service
@ToString
public class EquipmentService implements ILgMcsService {
	
	@Autowired
	private final IStockerSemRepository stockerSemRepository = null;
	
	private final Logger logger = LoggerFactory.getLogger(EquipmentService.class);
	
	
	public StockerSem getStocker(String equipmentName)
	{
		return stockerSemRepository.findOneByEquipmentName(equipmentName);
	}
	
	public void save(StockerSem sem)
	{
    	try
    	{
    		stockerSemRepository.save(sem);
    		logger.info("sem가 저장 되었습니다." + sem.toString());
    	}catch (Exception e) {
			logger.error("sem 저장을 실패 하였습니다."+sem.toString()+ e.toString());
		}
		
	}
	



	
	@Override
	public ServiceType getServiceTeye() {
		// TODO Auto-generated method stub
		return ServiceType.EquipmentService;
	}

}
