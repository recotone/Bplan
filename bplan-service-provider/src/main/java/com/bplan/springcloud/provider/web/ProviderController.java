/**
 * 
 */
package com.bplan.springcloud.provider.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	@RequestMapping("/info")
    public String info(String name) {
		logger.info("==== provider info ===={}",name);
        return "hi "+name;
    }

}
