/**
*
* @FileName
* EquipmentService.java
* @Project
* LgMcs
* @Date
* 2022. 12. 10.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.entity.Equipment;
import com.lgcns.mcs.repository.IEquipmentRepository;

/**
*
* @Package_name
* com.lgcns.mcs.services
* @file_name
* EquipmentService.java
* @Date
* 2022. 12. 10.
* @EditHistory
*
* @Discript
*
*/
@Service
public class EquipmentService implements ILgMcsService {

	@Autowired
	private final IEquipmentRepository equipmentRepository = null;

	public Equipment getEquipmentByEquipmentName(String equipmenName)
	{
		return equipmentRepository.findOneEquipmentByEquipmentName(equipmenName);
	}
	
	public void save(Equipment equipment)
	{
		equipmentRepository.save(equipment);
	}
	
	@Override
	public ServiceType getServiceTeye() {
		
		return ServiceType.EquipmentService;
	}

}
