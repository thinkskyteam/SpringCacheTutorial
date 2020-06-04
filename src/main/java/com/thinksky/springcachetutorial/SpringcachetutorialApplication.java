package com.thinksky.springcachetutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringcachetutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcachetutorialApplication.class, args);
	}

}
