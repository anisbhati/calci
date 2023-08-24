package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciApiController {
    
	@GetMapping("/getTest")
	public String getTest() {
		return "running.........";
	}
	
	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a,@PathVariable int b) {
		return "add is "+(a+b);
	}
}
