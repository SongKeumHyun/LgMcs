package com.lgcns.mcs.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.lgcns.mcs.entity.Unit;

public interface IUnitRepository  extends JpaRepository<Unit, String> {
	
	Unit findOneUnitByUnitId(String unitId);
	

	
	

	

}
