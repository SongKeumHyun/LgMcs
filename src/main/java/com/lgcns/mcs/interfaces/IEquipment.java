/**
 * 
 */
package com.lgcns.mcs.interfaces;

import java.util.List;

import com.lgcns.mcs.constant.McsConstant.State;
import com.lgcns.mcs.entity.Zone;


/**
 * @author kumh2
 *
 */
public interface IEquipment extends ILgLocationObject {

	
	String getEquipmentId();
	
	int getMaxCapa();
	
	int getCurrentCapa();
	
	List<Zone> getAllZone();
	
	State getState();
	
	void setState(State state);

	

}
