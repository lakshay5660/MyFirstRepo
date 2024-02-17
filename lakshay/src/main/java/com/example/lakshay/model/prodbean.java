package com.example.lakshay.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class prodbean {
	public prodbean()
	{
		System.out.println("this is prod bean");
	}
}
