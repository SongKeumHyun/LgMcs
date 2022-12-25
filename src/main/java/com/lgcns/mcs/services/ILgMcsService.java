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
	    EquipmentService,
	    TransferService,
	    ZoneService,
	    ShelfServe,
	    UnitService
	}
	
	ServiceType getServiceTeye();
	
}


