/**
*
* @FileName
* IStockerSemRepository.java
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
package com.lgcns.mcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.mcs.constant.McsConstant.State;
import com.lgcns.mcs.entity.StockerSem;

/**
*
* @Package_name
* com.lgcns.mcs.repository
* @file_name
* IStockerSemRepository.java
* @Date
* 2022. 10. 28.
* @EditHistory
*
* @Discript
*
*/
public interface IStockerSemRepository extends JpaRepository<StockerSem, String> {
	
	StockerSem  findOneByEquipmentName(String equipmentName);
	
	List<StockerSem> findByState(State state);
	

}
