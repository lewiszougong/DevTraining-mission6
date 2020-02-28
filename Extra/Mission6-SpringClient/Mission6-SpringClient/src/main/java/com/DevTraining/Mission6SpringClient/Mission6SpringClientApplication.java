package com.DevTraining.Mission6SpringClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Mission6SpringClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mission6SpringClientApplication.class, args);
	}

}

@RefreshScope
@RestController
class MessageRestController {

	@Value("${message:Default Hello}")
	private String message;

	@RequestMapping("/message")
	String getMessage() {
		return this.message;
	}
}
