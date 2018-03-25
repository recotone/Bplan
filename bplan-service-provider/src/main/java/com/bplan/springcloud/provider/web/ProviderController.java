/**
 * 
 */
package com.bplan.springcloud.provider.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yh
 *
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

	private static Logger logger = LoggerFactory.getLogger(ProviderController.class);
	
	@Value("${foo.name}")
	private String userName;

	@RequestMapping("/info")
	public String info(String name) {
		logger.info("==== provider info ===={}", name);
		return "HELLO: " + name;
	}

	
	@RequestMapping("/userInfo")
	public String userInfo() {
		logger.info("==== userInfo info ==== username: {}",userName);
		return "user: "+"----"+userName;
	}
}
