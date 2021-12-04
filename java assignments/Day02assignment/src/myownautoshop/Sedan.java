package myownautoshop;

public class Sedan extends Car {
	int length;
	public Sedan(int a, double b, String c) {
		super(a,b,c);
	}
	public double getsalePrice() {
		double price ;
		if(length>20) {
			 price = regularprice - (regularprice*0.05);
		}
		else {
			 price = regularprice - (regularprice*0.1);
		}
		return price;
	}
	public void show() {
		System.out.println("Sedan length : " + length);
		System.out.println("Sedan speed : " + speed);
		System.out.println("Sedan color : " + color);
		System.out.println("Sedan SalePrice : " + getsalePrice());
		System.out.println();
	}

}
