package com.bplan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * 采用的ribbon方式 + hystrix + HystrixDashboard
 * @author yh
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class ConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
