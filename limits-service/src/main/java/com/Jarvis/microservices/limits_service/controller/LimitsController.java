package com.Jarvis.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Jarvis.microservices.limits_service.bean.Limits;
import com.Jarvis.microservices.limits_service.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(config.getMinimum(),config.getMaximum());
	}
	
}
