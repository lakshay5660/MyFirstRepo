package com.example.lakshay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lakshay.model.myapplicationbean;

@RestController
public class environmentController {
	
	@Autowired
	public myapplicationbean mybean;
	
	@GetMapping("/")
	public String env()
	{
		return mybean.getMessage()+" "+mybean.getCount();
	}
}
