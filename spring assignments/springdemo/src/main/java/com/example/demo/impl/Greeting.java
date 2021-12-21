package com.example.demo.impl;
import org.springframework.stereotype.Component;
import com.example.demo.SpringInterface;

public class Greeting implements SpringInterface {

	@Override
	public String sayGreeting(String name) {
		
		return "hello "+name ;
	}

}
