package com.eric.microservices.configconsumer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.microservices.configconsumer.config.Configuration;
import com.eric.microservices.configconsumer.model.TimeoutConfig;

@Slf4j
@RestController
@AllArgsConstructor
public class ConsumerServiceController {

	private Configuration configuration;

	@GetMapping("/get-config/timeout")
	public ResponseEntity<TimeoutConfig> getTimeoutConfiguration(){

		ResponseEntity<TimeoutConfig> returnValue = null;

		log.debug("ConfigConsumerController.getTimeoutConfiguration() Begins...");

		TimeoutConfig timeoutConfig = new TimeoutConfig();
		timeoutConfig.setConnectionTimeoutMillis(configuration.getConnectionTimeoutMillis());
		timeoutConfig.setReadTimeoutMillis(configuration.getReadTimeoutMillis());

		log.info("Retrieving TimeoutConfig [{}]", timeoutConfig);

		returnValue = ResponseEntity.ok(timeoutConfig);

		log.debug("ConfigConsumerController.getTimeoutConfiguration() returnValue: " + returnValue);		

		log.debug("ConfigConsumerController.getTimeoutConfiguration() Ends...");		

		return (returnValue);
	}
}
