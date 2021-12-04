package com.sonata.day02assignment;
class pro{
	int proid;
	String proname;
	double proprice;
	pro(int a ,String b, double c){
		this.proid = a;
		this.proname = b;
		this.proprice = c;
	}
	public void display(double g) {
		System.out.println("product id is "+proid);
		System.out.println("product name is "+proname);
		System.out.println("product price with gst is "+gst(g));
		
	}
	public double gst(double g) {
		double gs = proprice + proprice*g/100;
		return gs;
	}
}

public class product {

	public static void main(String[] args) {
		pro p1 = new pro(10,"car",100);
		p1.display(10);
		pro p2 = new pro(01,"pen",10);
		p2.display(1);

	}

}
