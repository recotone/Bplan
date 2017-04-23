/**
 * 
 */
package com.bplan.springcloud.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bplan.springcloud.services.ConsumerService;

/**
 * @author yh
 *
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	 private static Logger logger = LoggerFactory.getLogger(ConsumerService.class);
	
	@Autowired
	private ConsumerService consumerService; 
	
	@RequestMapping(value ="/info")
	public String info(String name){
		logger.info("===== ConsumerController-feign info ====={}",name);
		return consumerService.info(name);
	}
}
