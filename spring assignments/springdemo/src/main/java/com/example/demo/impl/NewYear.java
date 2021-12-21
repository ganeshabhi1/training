package com.example.demo.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.NewYearInterface;
import com.example.demo.SpringInterface;

public class NewYear implements NewYearInterface {
	
	public SpringInterface getG() {
		return g;
	}

	public void setG(SpringInterface g) {
		this.g = g;
	}

	SpringInterface g;

	@Override
	public String wishes(String name) {
		// TODO Auto-generated method stub
		return "happy new year "+ g.sayGreeting(name);
	}

}
