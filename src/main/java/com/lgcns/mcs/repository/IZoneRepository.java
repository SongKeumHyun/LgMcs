/**
*
* @FileName
* IZoneRepository.java
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
package com.lgcns.mcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.mcs.entity.Shelf;
import com.lgcns.mcs.entity.Zone;

/**
*
* @Package_name
* com.lgcns.mcs.repository
* @file_name
* IZoneRepository.java
* @Date
* 2022. 10. 17.
* @EditHistory
*
* @Discript
*
*/
public interface IZoneRepository extends JpaRepository<Zone, Long> {
	
	

}
