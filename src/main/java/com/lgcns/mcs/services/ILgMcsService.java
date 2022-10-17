/**
 * 
 */
package com.lgcns.mcs.services;

/**
 * @author kumh2
 *
 */
public interface ILgMcsService {
	public enum ServiceType
	{
	    CarrierService,
	    SubStrateService,
	    EquipmentService,
	    TransferService,
	    ZoneService,
	    ShelfServe
	}
	
	ServiceType getServiceTeye();
	
	
}


