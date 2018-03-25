/**
 * 
 */
package com.bplan.springcloud.provider.web;

import java.text.DateFormat;
import java.util.Date;
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
		logger.info("==== provider2 info ===={}",name);
        return "HI :"+name;
    }
	
	@RequestMapping("/api/getName")
    public String getName(String name) {
		logger.info("==== provider2 getName ===={}",name);
        return "The name is : "+name;
    }
	
	@RequestMapping("/api/getCurrentTime")
    public String getCurrentTime() {
		Date date = new Date();
		String strdate = DateFormat.getInstance().format(date);
		logger.info("==== provider2 getCurrentTime ===={}",strdate);
        return "This time is : "+strdate;
    }

}
