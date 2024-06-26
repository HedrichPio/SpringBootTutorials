package com.springboot.hedrich.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@RequestMapping("/currencyService")
	public CurrencyServiceConfiguration retrieveAllCourses(){
		return currencyServiceConfiguration;
	}
}
