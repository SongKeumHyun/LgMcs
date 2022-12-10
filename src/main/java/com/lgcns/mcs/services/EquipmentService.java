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

import com.lgcns.mcs.entity.Equipment;
import com.lgcns.mcs.repository.IEquipmentRepository;

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
	private final IEquipmentRepository equipmentRepository = null;
	
	private final Logger logger = LoggerFactory.getLogger(EquipmentService.class);

	public Equipment getEquipmentByEquipmentId(String equipmentId )
	{
		return equipmentRepository.findOneEquimentByEquipmentId(equipmentId);
	}
	

	
	public Equipment save(Equipment equipment)
	{
		return equipmentRepository.save(equipment);
	}
	
	@Override
	public ServiceType getServiceTeye() {
		// TODO Auto-generated method stub
		return ServiceType.EquipmentService;
	}

}
