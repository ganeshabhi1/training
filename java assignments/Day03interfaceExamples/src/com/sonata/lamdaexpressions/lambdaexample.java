package com.sonata.lamdaexpressions;
@FunctionalInterface
interface simple
{
	void sum(int a);
}

public class lambdaexample {

	public static void main(String[] args) {
		simple s1 = (int a)->{System.out.println("WELCOME TO LAMBDA "+a);};
		s1.sum(10);
		myoneinterface x1 = ()->{System.out.println("my functional interface");};
		
		x1.showone();

	}

}
 