package com.example.SWE_B6;

import com.example.SWE_B6.controller.Controller;
import com.example.SWE_B6.entities.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.SWE_B6", "com.src.main.resources"})  // Ensure the correct package is scanned
public class SweB6Application {

	public static void main(String[] args) {

		System.out.println("Test1 9/19");
		SpringApplication.run(SweB6Application.class, args);
		//database thingy use postman




	}
}
