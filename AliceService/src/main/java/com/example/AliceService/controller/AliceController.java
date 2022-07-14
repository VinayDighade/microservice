package com.example.AliceService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Alice")
public class AliceController {

	@GetMapping("/Hello")
	public String HelloAlice() {
		return "Hello BoB";
	}
}
