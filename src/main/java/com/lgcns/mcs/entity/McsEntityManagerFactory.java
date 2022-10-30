/**
*
* @FileName
* McsEntityManagerFactory.java
* @Project
* LgMcs
* @Date
* 2022. 11. 26.
* @Writter
* kumh2
* @EditHistory
*
* @Discript
*
*/
package com.lgcns.mcs.entity;


import javax.persistence.EntityManagerFactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
*
* @Package_name
* com.lgcns.mcs.entity
* @file_name
* McsEntityManagerFactory.java
* @Date
* 2022. 11. 26.
* @EditHistory
*
* @Discript
*
*/
@Service
@Scope("singleton")
public class McsEntityManagerFactory {

	private static final Logger logger = LoggerFactory.getLogger(McsEntityManagerFactory.class);

	
	private EntityManagerFactory emf;
	
	public McsEntityManagerFactory() {
/*		
		logger.info("McsEntityManagerFactory 생성");

		emf = Persistence.createEntityManagerFactory("lg_mcs");
		
		if(emf != null)
			logger.info("살아 있다~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		else
			logger.info("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");

*/	

	}

}
