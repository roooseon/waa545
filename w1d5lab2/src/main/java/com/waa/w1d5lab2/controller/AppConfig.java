package com.waa.w1d5lab2.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.waa.w1d5lab2.service.SampleService;
import com.waa.w1d5lab2.service.SampleServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public SampleService getSampleService() {
		return new SampleServiceImpl();
	}
}
