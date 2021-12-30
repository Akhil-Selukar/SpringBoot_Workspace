package com.acecorp.Spring_boot_actuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello world!";
	}
}
