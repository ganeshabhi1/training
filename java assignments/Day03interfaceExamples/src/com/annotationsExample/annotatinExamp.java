package com.annotationsExample;
@FunctionalInterface
interface ganesh
{
	void display();
}
class emp implements ganesh
{
	public void mydata()
	{
		System.out.println("my data method");
	}
	public void display()
	{
		System.out.println("these ids dispalay method");
	}
}
class empshow extends emp{
	@Override()
	public void mydata()
	{
		super.mydata();
		System.out.println("my data call method");
	}
}

public class annotatinExamp {

	public static void main(String[] args) {
		empshow e1 = new empshow();
		e1.mydata();
		e1.display();

	}

}
