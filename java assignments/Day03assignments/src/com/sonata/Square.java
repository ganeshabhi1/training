package com.sonata;

public class Square extends Shape{
	public Square(double Length) {
		
		super(Length);
	}
	
	public double CalArea() {
		double area =this.l *this.l;
		return area;
	}
	public static void main(String[] args) {
		Square sq = new Square(4);
		System.out.println("Area of Triangle : "+sq.CalArea());
	}

}
