/**
*
* @FileName
* Zone.java
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
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name="TB_ZONE")
@IdClass(ZonePk.class)
public class Zone {
	
	private static final Logger logger = LoggerFactory.getLogger(Zone.class);
	
	@Id
	@Column(name ="ZONE_ID")
	private String zoneId;
	@Id
	@Column(name ="EQUIPMENT_ID")
	private String equipmentId;
	
	
	private String zoneName;
	
	private int zoneCapacity = 0;
	
	private int currentZoneCapacity = 0;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	

}
