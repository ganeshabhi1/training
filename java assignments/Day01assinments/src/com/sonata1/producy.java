package com.sonata1;
class product
{
	int pid;
	String pname;
	double pprice;
	public product(int pid , String pname , int pprice) {
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	public final double total()
	{
		double total = this.pprice+pprice*2/100;
		return total;
	}
	
}

public class producy {

	public static void main(String[] args) {
		

	}

}
