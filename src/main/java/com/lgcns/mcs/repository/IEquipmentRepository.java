/**
*
* @FileName
* IEquipmentRepository.java
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
package com.lgcns.mcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.mcs.entity.Equipment;

/**
*
* @Package_name
* com.lgcns.mcs.repository
* @file_name
* IEquipmentRepository.java
* @Date
* 2022. 12. 10.
* @EditHistory
*
* @Discript
*
*/
public interface IEquipmentRepository extends JpaRepository<Equipment, String> {
	
	Equipment findOneEquimentByEquipmentName(String equipmentName);
	
	Equipment findOneEquimentByEquipmentId(String equipmentId);
	
	

}
