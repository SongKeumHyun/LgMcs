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
	
	public void enventPublish();

	
	
}
