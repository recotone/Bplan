/**
 * 
 */
package com.bplan.springcloud.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 采用feign
 * @author yh
 */
@FeignClient(value = "service-provider")
public interface ConsumerService {
	
	@RequestMapping(value = "/provider/info",method = RequestMethod.GET)
    String info(@RequestParam(value = "name") String name);
}
