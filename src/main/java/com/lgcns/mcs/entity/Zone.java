package com.lgcns.mcs.entity;



import javax.persistence.Entity;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name="TB_ZONE")
public class Zone extends Unit{
	
	public String zoneName;
	
	public int currentCapacity;
	
	public int maxCapacity;
	

}
