package com.rab3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rab3"})
public class ApplicationMain {

	public static void main(String[] args) {

		SpringApplication.run(ApplicationMain.class, args);
	}
}
