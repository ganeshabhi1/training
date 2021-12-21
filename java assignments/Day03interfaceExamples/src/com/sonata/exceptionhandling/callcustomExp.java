package com.sonata.exceptionhandling;

public class callcustomExp {

	public static void main(String[] args) throws myownExp{
		int age = 10;
		if (age<18)
		{
			throw new myownExp("your are minor");
		}
		else {
			System.out.println("welcome to vote");
		}

	}

}
