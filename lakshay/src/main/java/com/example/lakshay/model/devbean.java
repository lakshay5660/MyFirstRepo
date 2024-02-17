package com.example.lakshay.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class devbean {

		public devbean()
		{
			System.out.println("this is dev bean");
		}
}
