package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private  String name4;
	private  String age4;
    private  String sex4;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello:springboot");
	}
}
