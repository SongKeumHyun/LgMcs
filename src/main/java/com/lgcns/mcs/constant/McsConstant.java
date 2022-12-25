package com.lgcns.mcs.constant;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Service("MCSConstants")
public class McsConstant {
	
	public enum EquipmentState
	{
		Down,
		Idle,
		Run
	}
	
	public enum CommunicationState
	{
		Disconneced,
		Connected,
		Selected,
		Offline,
		OnlineLocal,
		Online
	}
	
	public enum SemState
	{
		Init,
		Pausing,
		Paused,
		Auto
	}
	
	public enum ControlState
	{
		Offline,
		OnlineLocal,
		Online
	}
	
	public enum EquipmentType
	{
		Stocker,
		AGV,
		Lifter,
		Oht,
		Trf
	}
	
	public enum CarrierState
	{
		Installed,
		WaitIn,
		Transfering,
		WaitOut,
		Stored,
		Alternate,
		Completed
	}
	
	public enum UnitType
	{
		MpPort,
		MgvPort,
		Process,
		PorcessInlinePort,
		AgvPort,
		ConveyorPort,
		Buffer
	}


	
	public enum Direction
	{
		NONE,
		In,
		Out,
		BiDirection
	}
	
	public enum InlineMouveStatus
	{
		NONE,
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
