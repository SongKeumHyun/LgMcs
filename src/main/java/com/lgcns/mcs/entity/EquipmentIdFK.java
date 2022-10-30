/**
*
* @FileName
* EquipmentIdFK.java
* @Project
* LgMcs
* @Date
* 2022. 10. 28.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
*
* @Package_name
* com.lgcns.mcs.entity
* @file_name
* EquipmentIdFK.java
* @Date
* 2022. 10. 28.
* @EditHistory
*
* @Discript
*
*/
@SuppressWarnings("serial")
@Getter
@Setter
public class EquipmentIdFK implements Serializable {
	
	public EquipmentIdFK()
	{
		
	}
	
	public EquipmentIdFK(String equipmentId)
	{
		this.equipmentId = equipmentId;
	}
	
	private String equipmentId;
	
	

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		//result = prime * result + id;
		result = prime * result + ((equipmentId == null) ? 0 : equipmentId.hashCode());
		return result;
	}

}
