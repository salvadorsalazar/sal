package com.sal.sal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalApplication.class, args);
		System.out.println("landing page");
	}

}
