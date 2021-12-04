package com.sonata1;

public class currentaccount extends bank{
	currentaccount(int a ,String b , int c)
	{
		super(a,b,c);
	}
	currentaccount(){}

	public static void main(String[] args) {
		currentaccount c1 = new currentaccount();
		c1.accno=123;
		c1.accname="ganesh";
		c1.accbalance=123;
		c1.deposite();
		currentaccount c2 = new currentaccount(124,"abhi",500);
		c2.deposite();
				
		
		
	}

}
