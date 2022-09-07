package com.parseApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiParseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiParseApplication.class, args);
	}
}
