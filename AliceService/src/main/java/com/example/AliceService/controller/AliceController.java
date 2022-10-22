package com.example.AliceService.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.AliceService.AliceServiceConfiguration;

@RestController
@RequestMapping("Alice")
@CrossOrigin
@Slf4j
public class AliceController {
	
	private final AliceServiceConfiguration aliceServiceConfiguration;

	public static Integer counter =  0;
	@Autowired
	public AliceController(AliceServiceConfiguration aliceServiceConfiguration) {
		this.aliceServiceConfiguration = aliceServiceConfiguration;
	}
		
	@GetMapping("/Hello")
	public String HelloAlice() {
		log.info("[HelloAlice()] method is called");
		log.info("Call Counter ={}",counter+1);
		return aliceServiceConfiguration.getMessage();

	}

	@GetMapping("/reset")
	public void reset(){
		counter = 0;
		log.info("[Reset()] success");
	}
}
