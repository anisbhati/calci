package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciApiController {
   //dev

   // local prod 
	@GetMapping("/getDetails")
	public String getDetails() {
		//remote add
		//local dev
		return null;
	}
}
