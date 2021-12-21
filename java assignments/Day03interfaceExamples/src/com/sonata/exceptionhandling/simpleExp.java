package com.sonata.exceptionhandling;

public class simpleExp {
	public void div() {
		try
		{
			int c = 100/0;
			int a[] = {1,2,3,};
			System.out.println(a[10]);
		}catch (ArithmeticException e1) {System.out.println(e1);}
		catch (Exception e) { System.out.println(e);}
		
		 finally {
			 System.out.println("finally block");
		 }
		
		
	}
	public void show() {
		System.out.println("hai iam ganesh");
	}

	public static void main(String[] args) {
		simpleExp e1 = new simpleExp();
		e1.show();
		e1.div();
		

	}

}
