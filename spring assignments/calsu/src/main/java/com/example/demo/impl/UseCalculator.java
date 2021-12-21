package com.example.demo.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Calculator;
import com.example.demo.UseCalculatorInterface;
@Component
public class UseCalculator implements UseCalculatorInterface {
	@Autowired
	Calculator c;

	@Override
	public int useExpression(int x, int y, int z, int a) {
		int result = c.add(x, y)+c.sub(z, a);
		return result;
	}

}
