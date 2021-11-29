package com.example.Orch5sourceS3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Orch5sourceS3Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Orch5sourceS3Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Orch5sourceS3Application.class);
	}
}
