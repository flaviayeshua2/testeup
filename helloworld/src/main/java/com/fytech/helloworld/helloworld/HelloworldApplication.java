package com.fytech.helloworld.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
		
		System.out.println(new Pessoa("Marco", 37));
		
		System.out.println("Alterando");
		
		System.out.println("Alterando novamente");
	}
}
