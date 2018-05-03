package com.ibm.coke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CokeConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CokeConfigurationServerApplication.class, args);
	}
}
