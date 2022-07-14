package com.example.apigw.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import lombok.Getter;
import lombok.Setter;

@RefreshScope
@Getter
@Setter
@ConfigurationProperties
public class ApiGatewayConfig {

}
