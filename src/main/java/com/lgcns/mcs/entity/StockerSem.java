/**
*
* @FileName
* StockerSem.java
* @Project
* LgMcs
* @Date
* 2022. 10. 18.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.lgcns.mcs.constant.McsConstant.State;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
*
* @Package_name
* com.lgcns.mcs.entity
* @file_name
* StockerSem.java
* @Date
* 2022. 10. 18.
* @EditHistory
*
* @Discript
*
*/
@Entity
@Table(name="TB_STOCKERSEM")
@Getter
@Setter
@ToString
public class StockerSem  {
	
	@Id
	@Column(name = "EQUIPMENT_ID")
	String equipmentId;
	
	@Column(name = "EQUIPMENT_NAME", nullable = false, unique = true)
	String equipmentName;
	
	@Enumerated(EnumType.STRING)
	private State state;
	
	//StockerSemStatus
	//Zones
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	


}
