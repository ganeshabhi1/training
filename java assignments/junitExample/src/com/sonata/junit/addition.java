package com.sonata.junit;
class addi{
	int a,b;
	public int add(int a ,int b) {
		return a+b;
	}
}

public class addition {
	public static void main(String args[]) 
	{
		addi a1 = new addi();
		System.out.println(a1.add(10,20));
	}
	
	

}
