package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private  String name3;
	private  String age3;
    private  String sex;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello:springboot");
	}
}
