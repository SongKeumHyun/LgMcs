package com.lgcns.mcs.entity;

import com.lgcns.mcs.interfaces.ILgLocationObject;
import com.lgcns.mcs.interfaces.ILgMcsPersistence;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name="TB_CARRIER")
public class Carrier {

	private static final Logger logger = LoggerFactory.getLogger(Carrier.class);
	
	@Id @GeneratedValue
	private String mcsObjectId;
	
	
	public void setMcsObjectId(String mcsObjectId) {
		this.mcsObjectId = mcsObjectId;
	}

	public String getMcsObjectId() {
		return mcsObjectId;
	}

	

	private String carrierId;
	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	} 

}
