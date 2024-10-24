package com.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.client.controller.MyController;

@SpringBootApplication
public class DockerDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoClientApplication.class, args);
		System.out.print("args = "+args + "|.");
	}

}
