/**
*
* @FileName
* McsBasicEntity.java
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

import java.io.Serializable;
import java.lang.reflect.Field;

@SuppressWarnings("serial")
public class McsBasicEntity implements Serializable {
	
	public McsBasicEntity()
	{
		try 
		{
			for(Field field : getClass().getDeclaredFields())
			{
				if(field.getType().equals(String.class))
				{
					field.setAccessible(true);
					field.set(this,new String());
					
				}
				
			}
			
			@SuppressWarnings("rawtypes")
			Class superClass = getClass().getSuperclass();
			
			if(superClass == null)
			{
				return ;
			}
			
			for(Field field : superClass.getDeclaredFields())
			{
				if(field.getType().equals(String.class))
				{
					field.setAccessible(true);
					field.set(this,new String());
					
				}
				
			}			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
