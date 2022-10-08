/**
 * 
 */
package com.lgcns.mcs.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lgcns.mcs.entity.Carrier;

/**
 * @author kumh2
 *
 */
public interface ICarrierRepository extends JpaRepository<Carrier, String> {

}
