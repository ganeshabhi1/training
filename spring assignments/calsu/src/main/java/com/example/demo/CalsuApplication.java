package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalsuApplication {

	public static void main(String[] args) {
		ApplicationContext txt = SpringApplication.run(CalsuApplication.class, args);
		UseCalculatorInterface s =(UseCalculatorInterface) txt.getBean("useCalculator");
		System.out.println(s.useExpression(10,302,600,300));
	}

}
