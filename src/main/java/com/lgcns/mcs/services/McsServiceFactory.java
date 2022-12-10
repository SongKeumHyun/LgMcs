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

import lombok.AllArgsConstructor;


/**
 * @author kumh2
 *
 */
@Service
@AllArgsConstructor
public class McsServiceFactory {

	private static final Logger logger = LoggerFactory.getLogger(McsServiceFactory.class);
	
	private final Map<ServiceType, ILgMcsService> mcsServices = new HashMap<>();


    public McsServiceFactory(List<ILgMcsService> mcsService) {

        if(CollectionUtils.isEmpty(mcsService)) {
            throw new IllegalArgumentException("Ï°¥Ïû¨òÎäî ServiceÍ∞Ä ÜÏùå");
        }


        for (ILgMcsService tmpMcsService : mcsService) {
        	logger.info(" MCS Service ùÏÑ±Í∞Ä òÏóàµÎãà"+ tmpMcsService.toString());
        	
            this.mcsServices.put(tmpMcsService.getServiceTeye(), tmpMcsService);
        }
    }

    public ILgMcsService getService(ServiceType mcsServiceType) {
        return mcsServices.get(mcsServiceType);
    }
}
