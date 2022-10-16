/**
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lgcns.mcs.constant.McsConstant.ServiceStatus;
import com.lgcns.mcs.interfaces.IShelf;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
*
* @Package_name
* com.lgcns.mcs.entity
* @file_name
* Shelf.java
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
@Table(name="TB_SHELF")
public class Shelf implements IShelf {
	
	private static final Logger logger = LoggerFactory.getLogger(Shelf.class);
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String shelfId;
	
	@Enumerated(EnumType.STRING)
	private ServiceStatus serviceStatus;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	

}
