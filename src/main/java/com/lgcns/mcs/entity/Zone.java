/**
 * 
 */
package com.lgcns.mcs.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lgcns.mcs.constant.McsConstant.ServiceStatus;
import com.lgcns.mcs.interfaces.IZone;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
*
* @Package_name
* com.lgcns.mcs.entity
* @file_name
* Zone.java
* @Date
* 2022. 10. 16.
* @EditHistory
*
* @Discript
*
*/
@Getter
@Setter
@ToString
@Entity
@Table(name="TB_ZONE")
public class Zone  {
	private static final Logger logger = LoggerFactory.getLogger(Zone.class);
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	private String zoneName;
	
	private int maxCapa;
	
	private int currentCapa;
	

//	@OneToMany(mappedBy ="zone") // 상대편의 Map
//	private List<Shelf> shlefs = new ArrayList<Shelf>();
	
	@Enumerated(EnumType.STRING)
	private ServiceStatus serviceStatus;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
}
