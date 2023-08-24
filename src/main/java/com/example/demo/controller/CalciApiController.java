package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciApiController {
    
	@GetMapping("/getTest")
	public String getTest() {
		return "running.........";
	}
}
