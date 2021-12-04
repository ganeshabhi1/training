package com.sonata.packageexample;
class packag
{
	private int add(int a , int b)
	{
		return a+b;
	}
	int sub(int a , int b)
	{
		return a-b;
	}
	protected int mul(int a ,int b)
	{
		return a*b;
	}
	public int div(int a ,int b)
	{
		return a/b;
	}
}

public class packageexample {

	public static void main(String[] args) {
		packag p2 = new packag();
		
		p2.mul(20,30);
		p2.sub(20,30);
		p2.div(20,30);
		
		

	}

}
