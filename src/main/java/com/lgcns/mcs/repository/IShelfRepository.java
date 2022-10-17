/**
*
* @FileName
* IShelfRepository.java
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

import com.lgcns.mcs.entity.Carrier;
import com.lgcns.mcs.entity.Shelf;

/**
*
* @Package_name
* com.lgcns.mcs.repository
* @file_name
* IShelfRepository.java
* @Date
* 2022. 10. 17.
* @EditHistory
*
* @Discript
*
*/
public interface IShelfRepository extends JpaRepository<Shelf, Long> {
	
	Shelf findOneByShelfId(String shelfId);

}
