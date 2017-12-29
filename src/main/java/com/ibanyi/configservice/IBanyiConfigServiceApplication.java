package com.ibanyi.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class IBanyiConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IBanyiConfigServiceApplication.class, args);
	}
}
