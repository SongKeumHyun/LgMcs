/**
*
* @FileName
* IShelfRepository.java
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
package com.lgcns.mcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lgcns.mcs.constant.McsConstant.ServiceStatus;
import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.entity.ShelfPk;
import com.lgcns.mcs.entity.Zone;


public interface IShelfRepository extends JpaRepository<Shelf, ShelfPk> {
	
	Shelf findOneByCarrierId(String carrierId);
	
	List<Shelf> findByEquipmentIdAndZoneId(String equipmentId, String zoneId);


	@Query(value = " select p from Shelf p WHERE p.equipmentId = :equipmentId AND (p.carrierId IS NULL OR p.carrierId ='') ")
	List<Shelf> findEmptyCarrierInShelf(@Param("equipmentId") String equipmentId);

	
	@Query(value = " select p from Shelf p WHERE p.equipmentId = :equipmentId AND ( p.carrierId IS NOT NULL AND length(p.carrierId) > 0 ) ")
	List<Shelf> findExistsCarrierInShelf(@Param("equipmentId") String equipmentId);
	
	
	List<Shelf> findByEquipmentIdAndServiceStatus(String equipmentId, ServiceStatus serviceStatus);
	
	
	


}
