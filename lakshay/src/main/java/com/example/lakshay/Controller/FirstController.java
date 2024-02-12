package com.example.lakshay.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lakshay")
public class FirstController {

		@GetMapping("/home")
		public String homepage(Model model,@RequestParam(name="name") String myname)
		{
			model.addAttribute("name", myname);
			return "homepage";
		}
}
