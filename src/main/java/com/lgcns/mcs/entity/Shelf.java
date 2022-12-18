
package com.lgcns.mcs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import com.lgcns.mcs.constant.McsConstant.ServiceStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name="TB_SHELF")
@IdClass(ShelfPk.class)
public class Shelf {
	public Shelf()
	{
		
	}
	public Shelf(String equipmentId, String shelfId)
	{
		this.shelfId = shelfId;
		this.equipmentId = equipmentId;
		
	}
	
	@Id
	@Column(name ="EQUIPMENT_ID")
	private String equipmentId;
	
	@Id
	private String shelfId;
	
	private String zoneId;
	

	@Setter(value = AccessLevel.NONE)
	@Getter(value = AccessLevel.NONE)
	private String carrierId;
	
	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
		
		if(this.carrierId != null || carrierId.trim().isEmpty())
			this.isOccufied = true;
		else
			this.isOccufied = false;

	}

	@Transient
	@Setter(value = AccessLevel.NONE)
	private boolean isOccufied = false;



	private ServiceStatus serviceStatus = ServiceStatus.Inservice;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();
	
	 
	

}
