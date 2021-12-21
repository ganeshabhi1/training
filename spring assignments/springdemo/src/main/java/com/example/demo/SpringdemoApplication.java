package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.impl.Greeting;
@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext txt = SpringApplication.run(SpringdemoApplication.class, args);
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		NewYearInterface gr = (NewYearInterface) factory.getBean("newYear");
		
		System.out.println(gr.wishes("ganesh"));
	}

}
