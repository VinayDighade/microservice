package com.example.apigw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apigw.configuration.ApiGatewayConfig;

@RestController
@RequestMapping("v1/apigw")
public class ApiGatewayController {

	@Autowired
	ApiGatewayConfig apiGatwayConfig;
	
}
