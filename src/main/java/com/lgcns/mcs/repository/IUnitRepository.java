package com.lgcns.mcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.mcs.constant.McsConstant.UnitType;
import com.lgcns.mcs.entity.Unit;

public interface IUnitRepository  extends JpaRepository<Unit, String> {
	
	Unit findOneUnitByUnitId(String unitId);
	
	List<Unit> findAllUnitByOwnerId(String ownerId);
	
	List<Unit> findAllUnitByOwnerIdAndUnitType(String ownerId, UnitType unityType);
	
	Unit findOneUnitByUnitIdAndUnitType(String unitId, UnitType unityType);
	

}
