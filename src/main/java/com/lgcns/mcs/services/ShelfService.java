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

import java.util.List;

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
	
	
	public Shelf getShelfByCarrierId(String carrierId)
	{
		return shelfRepository.findOneByCarrierId(carrierId);
	}
	
	public List<Shelf> getShelfByEquipmentIdAndZoneId(String equipmentId, String zoneId)
	{
		return shelfRepository.findByEquipmentIdAndZoneId(equipmentId, zoneId);
	}
	
	public List<Shelf> getEmptyShelf(String equipmentId)
	{
		return shelfRepository.findEmptyCarrierInShelf(equipmentId);		
	}
	
	
	public List<Shelf> getExistsShelfByEquipment(String equipmentId)
	{
		return  shelfRepository.findExistsCarrierInShelf(equipmentId);		
	}
	
	


	
	
	

	@Override
	public ServiceType getServiceTeye() {

		return ServiceType.ShelfServe;
	}

}
