package com.sonata.lamdaexpressions;

public class logicclass implements myoneinterface {
	@Override
	public void display()
	{
		System.out.println("show this my display");
	}

	public static void main(String[] args) {
		logicclass l1 = new logicclass();
		l1.display();

	}

}
