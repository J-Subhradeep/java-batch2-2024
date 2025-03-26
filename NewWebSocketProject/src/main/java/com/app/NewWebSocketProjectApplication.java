package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class NewWebSocketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewWebSocketProjectApplication.class, args);
	}

}
