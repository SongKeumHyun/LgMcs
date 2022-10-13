/**
 * 
 */
package com.lgcns.mcs.interfaces;

import com.lgcns.mcs.constant.McsConstant.Direction;
import com.lgcns.mcs.constant.McsConstant.State;

/**
 * @author kumh2
 *
 */
public interface IPort extends ILgLocationObject {


	
	String getPortId();
	
	void setPortId(String portId);
	
	Direction getDirection();
	
	void setDirection(Direction direction);
	
	State getState();
	
	void setState(State state);
	
}
