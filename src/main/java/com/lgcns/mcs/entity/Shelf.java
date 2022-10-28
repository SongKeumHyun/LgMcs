/**
 * 
 */
package com.lgcns.mcs.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lgcns.mcs.constant.McsConstant.Location;
import com.lgcns.mcs.constant.McsConstant.ServiceStatus;
import com.lgcns.mcs.interfaces.IShelf;
import com.lgcns.mcs.interfaces.ICarrier.CarrierState;

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
	
	public Shelf()
	{
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
    @JoinColumn (name = "EQUIPMENT_ID") 
	private StockerSem stockerSem;
	 	
	
	
	@Column(nullable = false)
	private String shelfId;

	@OneToOne
	@JoinColumn(name = "CARRIER_ID")
	private Carrier carrier;

	
	@Enumerated(EnumType.STRING)
	private ServiceStatus serviceStatus = ServiceStatus.Inservice ;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	
	
	public String getOwnerStockerName()
	{
		return null; //this.stockerSem.equipmentName;
	}
	
	/**
	* @Method
	* getCarrierId
	* @Date
	* 2022. 10. 28.
	* @Writter
	* kumh2
	* @EditHistory
	*
	* @Discript
	*
	* @return 찾는 Carrier가 없다면 Empty String인 ""를 리턴 함
	*/
	public String getCarrierId()
	{
		return null ;//this.carrier == null ? "" : this.carrier.getCarrierId() ;
	}
	

}
