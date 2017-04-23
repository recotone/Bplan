/**
 * 
 */
package com.bplan.springcloud.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bplan.springcloud.services.impl.ConsumerServiceErrorImpl;

/**
 * 采用feign
 * @author yh
 */
@FeignClient(value = "service-provider",fallback = ConsumerServiceErrorImpl.class )
public interface ConsumerService {
	
	@RequestMapping(value = "/provider/info",method = RequestMethod.GET)
    String info(@RequestParam(value = "name") String name);
}
