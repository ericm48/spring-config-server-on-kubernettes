package com.eric.microservices.configserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableConfigServer
@RefreshScope
@SpringBootApplication
public class ConfigServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerServiceApplication.class, args);
	}
}
