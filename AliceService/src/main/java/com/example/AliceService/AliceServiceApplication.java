package com.example.AliceService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AliceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliceServiceApplication.class, args);
	}

}
