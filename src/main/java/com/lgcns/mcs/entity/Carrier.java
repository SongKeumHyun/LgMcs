package com.lgcns.mcs.entity;

import java.util.Date;

import javax.persistence.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class Carrier implements ICarrier {

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
	public Date getInstallTime() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setInstallTime(Date installTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setDataChangedTime(Date changedTime) {
		
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public Date getChangedTime() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CarrierState getCurrentCarrierState() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setCarreirState(CarrierState carrierState) {
		// TODO Auto-generated method stub
		
	}
	




	

}
