/**
*
* @FileName
* Equipment.java
* @Project
* LgMcs
* @Date
* 2022. 12. 10.
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
import javax.persistence.Transient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lgcns.mcs.constant.McsConstant.*;

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
* 2022. 12. 10.
* @EditHistory
*
* @Discript
*
*/
@Entity
@Getter
@Setter
@ToString
@Table(name="TB_EQUIPMENT")
public class Equipment {
	
	private static final Logger logger = LoggerFactory.getLogger(Equipment.class);
	
	@Id 
	private String equipmentId;
	
	@Column(nullable = false, unique = true)
	private String equipmentName="";

    @Enumerated(EnumType.STRING)
	private EquipmentState equipmentState= EquipmentState.Down;

    @Enumerated(EnumType.STRING)
	private CommunicationState communication = CommunicationState.Disconneced;
    
    
    @Enumerated(EnumType.STRING)
	private SemState semState = SemState.Offline;
    
    
    private String factoryName = "";
    
    private int maxCapacity = 0;
    
    @Transient
    private int currentCapacity = 0;
    
    
    
    
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	

}
