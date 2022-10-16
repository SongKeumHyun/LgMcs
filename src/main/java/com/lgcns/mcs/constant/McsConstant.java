package com.lgcns.mcs.constant;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service("MCSConstants")
public class McsConstant {

	public enum State
	{
		Run,
		idle,
		Down
	}
	
	public enum Direction
	{
		In,
		Out,
		BiDirection
	}
	
	public enum InlineStatus
	{
		LR,
		UR,
		WAIT
	}
	
	public enum ServiceStatus
	{
		Inservice,
		OutOfService
	}
	

	/**
	*
	* @Package_name
	* com.lgcns.mcs.constant
	* @file_name
	* McsConstant.java
	* @Date
	* 2022. 10. 16.
	* @EditHistory
	*
	* @Discript
	*
	*/
	@Getter
	@Setter
	@Embeddable
	public class Location
	{

		private String EquipmentId;
		
		private String UnitId;
		
	}
}
