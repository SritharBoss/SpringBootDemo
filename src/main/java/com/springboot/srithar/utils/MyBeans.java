package com.springboot.srithar.utils;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyBeans {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Scheduled(cron = "* * 1 * * ?")
	public void timeNow() {
		System.out.print("Time is --> "+new Date()+"\r");
	}
}
