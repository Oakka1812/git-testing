package com.lesson.oakka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestingApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("This is git testing.");
		SpringApplication.run(GitTestingApplication.class, args);
	}

}
