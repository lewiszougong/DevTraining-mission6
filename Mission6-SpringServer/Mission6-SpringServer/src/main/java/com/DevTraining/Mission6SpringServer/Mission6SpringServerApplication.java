package com.DevTraining.Mission6SpringServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Mission6SpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mission6SpringServerApplication.class, args);
	}

}
