package com.example.AliceService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AliceService.AliceServiceConfiguration;

@RestController
@RequestMapping("Alice")
@CrossOrigin
public class AliceController {
	
	private final AliceServiceConfiguration aliceServiceConfiguration;

	@Autowired
	public AliceController(AliceServiceConfiguration aliceServiceConfiguration) {
		this.aliceServiceConfiguration = aliceServiceConfiguration;
	}
		
	@GetMapping("/Hello")
	public String HelloAlice() {
		return aliceServiceConfiguration.getMessage();
	}
}
