/**
*
* @FileName
* ZonePk.java
* @Project
* LgMcs
* @Date
* 2022. 12. 10.
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

@SuppressWarnings("serial")
@Setter
@Getter
@AllArgsConstructor
public class ZonePk extends McsBasicEntity implements Comparable<ZonePk> {
	
	public ZonePk()
	{
		
	}
	
	@Id
	private String zoneId;
	
	@Id	
	private String equipmentId;


	@Override
	public int compareTo(ZonePk arg0) {

		return 0;
	}

}
