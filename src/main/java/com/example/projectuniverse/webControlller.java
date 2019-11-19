package com.example.projectuniverse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webControlller {

	@RequestMapping("/")
	public String index() {
		return "Hello World.";
	}
}
