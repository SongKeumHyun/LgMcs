package com.lgcns.mcs.entity;

import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name="TB_CARRIER")
public class Carrier {

	private static final Logger logger = LoggerFactory.getLogger(Carrier.class);
	
	@Id @GeneratedValue
	private Long mcsObjectId;
	
	private String carrierId="";

	private String carrierState="";



	

}
