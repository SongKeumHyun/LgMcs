package com.lgcns.mcs.entity;

import java.util.Date;

import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AbstractAggregateRoot;

import com.lgcns.mcs.constant.McsConstant.Location;
import com.lgcns.mcs.event.CarrierEvent;
import com.lgcns.mcs.interfaces.ICarrier;
import com.lgcns.mcs.tool.BooleanToYNConverter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
*
* @Package_name
* com.lgcns.mcs.entity
* @file_name
* Carrier.java
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
@Table(name="TB_CARRIER")
public class Carrier extends AbstractAggregateRoot<Carrier> implements ICarrier  {

	public Carrier()
	{
		
	}
	
	private static final Logger logger = LoggerFactory.getLogger(Carrier.class);
	

	 
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String carrierId="";

    @Enumerated(EnumType.STRING)
	private CarrierState carrierState= CarrierState.Installed;

	private String lotId = "";
	
	
	/**
	 * @Field
	 * isHold
	 * @Type
	 * boolean
	 * @Description
	 * MES 요청에 의한 Move 금지 여부
	 * True is Holded
	 */
	@Convert(converter = BooleanToYNConverter.class)
	private boolean isHold;
	
	@Embedded
	private Location location;
	

	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();

	@Override
	public void enventPublish() {
		// TODO Auto-generated method stub
		this.registerEvent(new CarrierEvent(this));
		
	}






	

}
