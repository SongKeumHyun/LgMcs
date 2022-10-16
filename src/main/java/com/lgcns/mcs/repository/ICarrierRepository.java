/**
 * 
 */
package com.lgcns.mcs.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lgcns.mcs.entity.Carrier;
import com.lgcns.mcs.interfaces.ICarrier.CarrierState;

/**
 * @author kumh2
 *
 */
public interface ICarrierRepository extends JpaRepository<Carrier, Long> {

	Carrier findOneByCarrierId(String carreirId);
	
	List<Carrier> findByCarrierState(CarrierState state);
	
	
}
