package com.bplan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 采用的ribbon方式
 * @author yh
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
