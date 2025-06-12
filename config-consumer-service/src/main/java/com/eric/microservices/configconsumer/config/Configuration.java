package com.eric.microservices.configconsumer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@EnableRetry

@ConfigurationProperties(prefix="config-consumer-service")
public class Configuration {

	private Integer connectionTimeoutMillis;
	private Integer readTimeoutMillis;

// Convenience 4 now..
	public Configuration()
	{
		this.setConnectionTimeoutMillis(22);
		this.setReadTimeoutMillis(22);
	}	
}
