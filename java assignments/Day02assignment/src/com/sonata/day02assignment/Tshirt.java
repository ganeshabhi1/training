package com.sonata.day02assignment;
class shirt
{
	String color;
	String material;
	String design;
	shirt(String a , String b ,String c)
	{
		this.color =a;
		this.material =b;
		this.design =c;
		
	}
	void display()
	{
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
	}
}


public class Tshirt {

	public static void main(String[] args) {
		shirt small = new shirt("yellow","cotton","v shape");
		shirt large = new shirt("red","cotton","round neck");
		shirt xl = new shirt("orange","slick","v shape");
		small.display();
		large.display();
		xl.display();
		
		

	}

}
