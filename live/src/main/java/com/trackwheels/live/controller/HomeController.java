package com.trackwheels.live.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(path = "/getResponse")
	public String homePage() {
		return "Track Wheels";
	}
}
