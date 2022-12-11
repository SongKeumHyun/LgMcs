/**
*
* @FileName
* ShelfPk.java
* @Project
* LgMcs
* @Date
* 2022. 12. 11.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@SuppressWarnings("serial")
public class ShelfPk extends McsBasicEntity implements Comparable<ZonePk> {

	public ShelfPk()
	{
		
	}

	@Id	
	private String equipmentId;
	
	@Id
	private String shelfId;
	
	@Override
	public int compareTo(ZonePk arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
