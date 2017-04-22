/**
 * 
 */
package com.bplan.springcloud.web.controller;

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

	@Autowired
	private ConsumerService consumerService; 
	
	@RequestMapping(value ="/info")
	public String info(String name){
		return consumerService.info(name);
	}
}
