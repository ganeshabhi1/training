package com.sonata1;

public class manager extends employee {
	manager(){}
	manager(int x,String y, double z)
	{
		super(x,y,z);
	}
	public double aslcal(double hra , double da)
	{
		double total = super.aslcal(hra,da)+500;
		return total;
	}

	public static void main(String[] args) {
		manager m1 = new manager(10,"ganesh",1000.00);
		System.out.println(m1.aslcal(100, 200));
		m1.display();
		
		

	}

}
