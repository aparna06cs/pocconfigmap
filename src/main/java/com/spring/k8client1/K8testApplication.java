package com.spring.k8client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class K8testApplication {

	public static void main(String[] args) {
		System.out.println("**********Inside main application************");
		SpringApplication.run(K8testApplication.class, args);
	}

}
