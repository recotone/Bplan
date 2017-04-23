/**
 * 
 */
package com.bplan.springcloud.services.impl;

import org.springframework.stereotype.Service;

import com.bplan.springcloud.services.ConsumerService;

/**
 * @author yh
 *
 */
@Service
public class ConsumerServiceErrorImpl implements ConsumerService {

	/* (non-Javadoc)
	 * @see com.bplan.springcloud.services.ConsumerService#info(java.lang.String)
	 */
	@Override
	public String info(String name) {
		return "=====> error: "+name;
	}

}
