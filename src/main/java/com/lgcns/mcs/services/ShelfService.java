/**
*
* @FileName
* ShlefService.java
* @Project
* LgMcs
* @Date
* 2022. 10. 17.
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

import com.lgcns.mcs.entity.Carrier;
import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.repository.IShelfRepository;

/**
*
* @Package_name
* com.lgcns.mcs.services
* @file_name
* ShlefService.java
* @Date
* 2022. 10. 17.
* @EditHistory
*
* @Discript
*
*/
@Service
public class ShelfService implements ILgMcsService{

	private static final Logger logger = LoggerFactory.getLogger(ShelfService.class);
	

	
	@Autowired
	private final IShelfRepository shelfRepository = null;
	
	public Shelf getSelf(String shlefId)
	{
		return shelfRepository.findOneByShelfId(shlefId);
	}
	
	public void save(Shelf shelf)
	{
    	try
    	{
    		shelfRepository.save(shelf);
    		logger.info("Shelf가 저장 되었습니다." + shelf.toString());
    		
    	}catch (Exception e) {
			logger.error("Shelf ID  저장을 실패 하였습니다."+e.toString()+ shelf.toString());
		}

	}
	
	
	
	
	@Override
	public ServiceType getServiceTeye() {
		// TODO Auto-generated method stub
		return ServiceType.ShelfServe;
	}

}
