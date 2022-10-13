/**
 * 
 */
package com.lgcns.mcs.interfaces;

import com.lgcns.mcs.constant.McsConstant.State;

/**
 * @author kumh2
 *
 */
public interface IUnit extends ILgLocationObject {
	State getState();
	
	void setState(State state);


}
