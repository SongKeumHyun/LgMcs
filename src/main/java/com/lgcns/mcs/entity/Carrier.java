package com.lgcns.mcs.entity;

import java.util.Date;

import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.AbstractAggregateRoot;

import com.lgcns.mcs.event.CarrierEvent;
import com.lgcns.mcs.interfaces.ICarrier;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



/**
 * @author kumh2
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
	

	 @Id
	private String carrierId="";

	private CarrierState carrierState= CarrierState.Installed;

	private String lotId = "";
	

	@Temporal(TemporalType.TIMESTAMP)
	private Date installTime = new Date();

	@Temporal(TemporalType.TIMESTAMP)
	private Date chagedDataTime = new Date();

	@Override
	public void enventPublish() {
		// TODO Auto-generated method stub
		CarrierEvent e = new CarrierEvent(this);
		this.registerEvent(e);
		
	}






	

}
