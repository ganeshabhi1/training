package myownautoshop;

public class Truck extends Car{
	int weight ;
	public Truck(int a , double b , String c)
	{
		super(a,b,c);
	}
	public double getsalceprice()
	{
		double price ;
		if(weight>2000) {
			 price = regularprice - (regularprice*10/100);
		}
		else {
			 price = regularprice - (regularprice*20/100);
		}
		return price;
	}
	public void show()
	{
		System.out.println("Truck weight : " + weight);
		System.out.println("Truck speed : " + speed);
		System.out.println("Truck color : " + color);
		System.out.println("Truck SalePrice : " + getsalceprice());
		System.out.println();
	}

}
