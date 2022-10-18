/**
*
* @FileName
* Equipment.java
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

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
* Equipment.java
* @Date
* 2022. 10. 18.
* @EditHistory
*
* @Discript
*
*/
@Getter
@Setter
@ToString
@Entity(name = "TB_EQUIPMENT")
public abstract class Equipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String equipmentId;
	
	@Enumerated(EnumType.STRING)
	private State state;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	

}
