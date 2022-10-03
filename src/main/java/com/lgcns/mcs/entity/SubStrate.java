package com.lgcns.mcs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_SUBSTRATE")
public class SubStrate {
	
	private static final Logger logger = LoggerFactory.getLogger(SubStrate.class);

	
	@Id
	private String subStrateId;
	
	@ManyToOne
	@JoinColumn(name = "CARRIER_ID")
	private Carrier carreir;
	
	
	
}
 