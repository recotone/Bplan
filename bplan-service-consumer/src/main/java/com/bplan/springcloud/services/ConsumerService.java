/**
 * 
 */
package com.bplan.springcloud.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


/**
 * @author yh
 *
 */
@Service
public class ConsumerService {
	
	 private static Logger logger = LoggerFactory.getLogger(ConsumerService.class);
	
	 @Autowired
	 RestTemplate restTemplate;

	 @HystrixCommand(fallbackMethod = "errorHandler")
	 public String info(String name){
		 logger.info("===== ConsumerService info ====={}",name);
		 return restTemplate.getForObject("http://SERVICE-PROVIDER/provider/info?name="+name,String.class);
	}
	 
	 private String errorHandler(String name){
		 return "hi: "+name+", is error !";
	 }

}
