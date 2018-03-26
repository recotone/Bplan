/**
 * 
 */
package com.bplan.springcloud.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yh
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {

	 private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value ="/info")
	public String info(String name){
		logger.info("===== TEST info ====={}",name);
		return restTemplate.getForObject("http://localhost:8080/consumer/info?name="+name,String.class);
	}
}
