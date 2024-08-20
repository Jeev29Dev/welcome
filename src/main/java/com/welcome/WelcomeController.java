package com.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
		@GetMapping(value = "start")
		public String Getdata() {
			return "WELCOME  \r\n   " + "Create your website and grow your business with creative developers   \r\n"
					+ "JeevsTechno Design and Developers     \r\n";
	}
	}

