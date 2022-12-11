/**
*
* @FileName
* ShelfService.java
* @Project
* LgMcs
* @Date
* 2022. 12. 11.
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

import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.repository.IShelfRepository;

import lombok.ToString;


@Service
@ToString
public class ShelfService implements ILgMcsService {

	private final Logger logger = LoggerFactory.getLogger(ShelfService.class);
	
	@Autowired
	private final IShelfRepository shelfRepository = null;
	
	public void delete(Shelf shelf)
	{
		logger.info("Shelf Delete Info : " + shelf.toString());
		shelfRepository.delete(shelf);
		
	}
	
	public Shelf save(Shelf shelf)
	{
		logger.info("Shelf Saved Info : " + shelf.toString());
		return shelfRepository.save(shelf);
		
	}
	

	@Override
	public ServiceType getServiceTeye() {

		return ServiceType.ShelfServe;
	}

}
