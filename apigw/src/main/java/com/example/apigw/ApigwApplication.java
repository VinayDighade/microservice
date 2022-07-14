package com.example.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.example.apigw.configuration.ApiGatewayConfig;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableFeignClients
@Slf4j
public class ApigwApplication {

	@Bean
	public ApiGatewayConfig configProperties() {
		return new ApiGatewayConfig();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApigwApplication.class, args);
	}

}
