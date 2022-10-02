package com.lgcns.mcs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.lgcns.mcs.constant.McsConstant;
import com.lgcns.mcs.entity.Carrier;

import lombok.Getter;
import lombok.Setter;


@Component
@Transactional
public class LgMcsApplicationRunner implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(LgMcsApplicationRunner.class);
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		logger.info("MCS Application Runner 실행"	);
		
		Carrier carrier = new Carrier();
		
		carrier.setCarrierId("A");
		carrier.setCarrierState(McsConstant.CARRIER.State.Install);
		
	
		entityManager.persist(carrier);

		
		logger.info("MCS Application Runner 종료"	);
		
	}

}
