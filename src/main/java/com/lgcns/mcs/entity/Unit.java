package com.lgcns.mcs.entity;

import java.util.Date;

import javax.persistence.*;

import com.lgcns.mcs.constant.McsConstant.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="DTYPE")
@Table(name="TB_UNIT")
public class Unit {
	
	@Id
	@Column(nullable = false, unique = true)
	public String unitId ="";
	
	@Column(nullable = false, unique = true)
	public String equipmentId;
	
	


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
	
    @Enumerated(EnumType.STRING)
	private ServiceStatus serviceStatus = ServiceStatus.Inservice;
    
    
    @Enumerated(EnumType.STRING)
	private EquipmentState equipmentState= EquipmentState.Down;
    

    
    @Enumerated(EnumType.STRING)
    private InlineMouveStatus inlineMoveStatus = InlineMouveStatus.NONE;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();


}
