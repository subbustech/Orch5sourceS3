package com.example.Orch5sourceS3;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String sayHelloWorld() throws UnknownHostException {
		return "Hello World - V1 - " + InetAddress.getLocalHost().getHostAddress();
	}
}
