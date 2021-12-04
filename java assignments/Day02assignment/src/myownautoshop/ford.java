package myownautoshop;

public class ford extends Car {
	int year;
	double manufacturerDiscount;
	public ford(int a, double b, String c) {
		super(a,b,c);
		
	}
	public double getsalePrice() {
		double price ;
		double d = regularprice*(manufacturerDiscount/100.0);
		price= regularprice - (d);
		return price;
	}
	public void show() {
		
		System.out.println("Ford year : " + year);
		System.out.println("Ford speed : " + speed);
		System.out.println("Ford color : " + color);
		System.out.println("Ford SalePrice : " + getsalePrice());
		System.out.println();
	}

}
