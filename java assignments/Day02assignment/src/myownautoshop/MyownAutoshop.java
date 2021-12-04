package myownautoshop;

public class MyownAutoshop {

	public static void main(String[] args) {
		Sedan s = new Sedan(500, 34500.20, "white");
		s.length = 30;
		ford f1 = new ford(138, 82349.67, "blue");
		ford f2 = new ford(757, 564767.86, "navy");
		f1.year = 2017;
		f1.manufacturerDiscount=20;
		f2.year = 2016;
		f2.manufacturerDiscount=15;
		Truck t = new Truck(456, 6765786.776, "orange");
		t.weight = 564768;
		
		s.show();
		f1.show();
		f2.show();
		t.show();

	}

}
