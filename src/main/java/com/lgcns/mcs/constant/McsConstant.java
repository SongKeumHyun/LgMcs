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
		Offline,
		Online,
		Auto,
		pausing,
		paused,
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
