package com.lgcns.mcs.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgcns.mcs.constant.McsConstant.UnitType;
import com.lgcns.mcs.entity.Unit;
import com.lgcns.mcs.repository.IUnitRepository;

import lombok.ToString;

@Service
@ToString
public class UnitService implements ILgMcsService{
	
	private final Logger logger = LoggerFactory.getLogger(UnitService.class);
	
	@Autowired
	private final IUnitRepository unitRepository = null;
	
	
	public boolean isExistUnit(String unitId)
	{
		return unitRepository.existsById(unitId);
	}
	
	public List<Unit> getMpPortByEquipment(String equipmentId)
	{
		return unitRepository.findAllUnitByOwnerIdAndUnitType(equipmentId, UnitType.MpPort);
	}
	
	public List<Unit> getMgvPortByEquipment(String equipmentId)
	{
		return unitRepository.findAllUnitByOwnerIdAndUnitType(equipmentId, UnitType.MgvPort);
	}
	
	public List<Unit> getPorcessInlineByEquipmentId(String equipmentId)
	{
		return unitRepository.findAllUnitByOwnerIdAndUnitType(equipmentId, UnitType.PorcessInlinePort);
	}
	
	public Unit getUnitByUnitId(String UnitId)
	{
		return unitRepository.findOneUnitByUnitId(UnitId);
	}
	
	public Unit getInlinePort(String unitId)
	{
		return unitRepository.findOneUnitByUnitIdAndUnitType(unitId, UnitType.PorcessInlinePort);
	}
	

	public void upDate(Unit unit)
	{
		try 
		{
			unitRepository.save(unit);
			logger.info("Unit Saved Sucess Info " + unit.toString());
				
		}catch (Exception e) 
		{
			logger.error("Unit Update Fail " +e.toString() + unit.toString());
		}
		
		
	}
	public void save(Unit unit)
	{
		unitRepository.save(unit);
	}
	
	
	
	@Override
	public ServiceType getServiceTeye() {
		return ServiceType.UnitService;
	}

}
