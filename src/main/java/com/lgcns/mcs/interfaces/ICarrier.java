package com.lgcns.mcs.interfaces;

import java.util.Date;



/**
 * Base Carrier Model
 * @author kumh2
 *
 */
public interface ICarrier extends ILgLocationObject {
	
	public enum CarrierState
	{
		Installed,
		WaitIn,
		Transfering,
		WaitOut,
		Stored,
		Alternate,
		Completed
	}

	String getCarrierId();
	
	void setCarrierId(String carrierId);
	
	Date getInstallTime();
	
	void setInstallTime(Date installTime);
	
	void setDataChangedTime(Date changedTime);
	
	Date getChangedTime();
	
	CarrierState getCurrentCarrierState();
	
	void setCarreirState(CarrierState carrierState);
	
	
}
