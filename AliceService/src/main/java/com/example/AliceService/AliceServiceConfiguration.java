package com.example.AliceService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties
@RefreshScope
@Getter
@Setter
public class AliceServiceConfiguration {

	@Value("${BobValue}")
	private String message;
}
