package com.demo.client.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
@RestController
public class MyController {

	@GetMapping("/call-test-docker")
	public String getDataResponse() {
		//SpringApplication.run(MyController.class, "[Ljava.lang.String;@34072af");
		
		String url = "http://127.0.0.1:54408/test-docker";
		WebClient.Builder bluiderA = WebClient.builder();
		String result = bluiderA.build().get().
						uri(url).retrieve().
						bodyToMono(String.class).block();
		return "The repsonse from the client is: " + result;
	}
}
