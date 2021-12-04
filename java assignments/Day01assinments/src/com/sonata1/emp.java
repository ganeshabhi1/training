package com.sonata1;
class employee {
	int empid;
	String  empname ;
	double salary ;
	employee(){}
	employee(int a ,String b,double c){
		this.empid = a;
		this.empname = b;
		this.salary = c;
		
	}
	public final double aslcal(double hra , double da)
	{
		double total = this.salary+hra+da;
		return total;
	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
	}
	
}

public class emp {

	public static void main(String[] args) {
		

	}

}
