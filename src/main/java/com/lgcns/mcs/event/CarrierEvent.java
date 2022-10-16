/**
 * 
 */
package com.lgcns.mcs.event;

import org.springframework.context.ApplicationEvent;

import com.lgcns.mcs.entity.Carrier;

import lombok.Getter;

/**
 * @author kumh2
 *
 */
@Getter
public class CarrierEvent extends ApplicationEvent{

	private final Carrier carrier;
	/**
	 * @param source
	 */
	public CarrierEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
 		this.carrier = (Carrier)source;
	}

}
