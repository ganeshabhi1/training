package com.example.demo.impl;

import org.springframework.stereotype.Component;

import com.example.demo.Calculator;
@Component
public class Calculatorimpl implements Calculator {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return (x+y);
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return (x-y);
	}

}
