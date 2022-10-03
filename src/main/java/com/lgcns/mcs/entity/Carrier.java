package com.lgcns.mcs.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import antlr.collections.List;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name="TB_CARRIER")
public class Carrier {

	private static final Logger logger = LoggerFactory.getLogger(Carrier.class);
	

	 @Id
	private String carrierId="";

	private String carrierState="";
	
	private Location location = new Location();
	
	private String lotId = "";
	

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdTime = new Date();



	

}
