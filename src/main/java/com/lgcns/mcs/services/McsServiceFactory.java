/**
 * 
 */
package com.lgcns.mcs.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.lgcns.mcs.services.ILgMcsService.ServiceType;



/**
 * @author kumh2
 *
 */
@Service
public class McsServiceFactory {

	private static final Logger logger = LoggerFactory.getLogger(McsServiceFactory.class);
	
	private final Map<ServiceType, ILgMcsService> mcsServices = new HashMap<>();


    public McsServiceFactory(List<ILgMcsService> mcsService) {

        if(CollectionUtils.isEmpty(mcsService)) {
            throw new IllegalArgumentException("존재하는 Service가 없음");
        }


        for (ILgMcsService tmpMcsService : mcsService) {
        	
            this.mcsServices.put(tmpMcsService.getServiceTeye(), tmpMcsService);
        }
    }

    public ILgMcsService getService(ServiceType mcsServiceType) {
        return mcsServices.get(mcsServiceType);
    }
}
