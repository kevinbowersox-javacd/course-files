package com.linkedin.javacd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApplicationConfig {
	
	@Value("${service.room.port}")
	private String roomServicePort;
	
	@Value("${service.guest.port}")
	private String guestServicePort;
	
	@Value("${service.room.domain}")
	private String roomServiceDomain;
	
	@Value("${service.guest.domain}")
	private String guestServiceDomain;
	
	@Bean("roomServiceClient")
	public WebClient roomServiceClient() {
		String port = this.roomServicePort.isEmpty() ? "":":" + this.roomServicePort; 
		return WebClient.create(String.format("%s%s", this.roomServiceDomain, port));
	}
	
	@Bean("guestServiceClient")
	public WebClient guestServiceClient() {
		String port = this.guestServicePort.isEmpty() ? "":":" + this.guestServicePort; 
		return WebClient.create(String.format("%s%s", this.guestServiceDomain, port));
	}

}
