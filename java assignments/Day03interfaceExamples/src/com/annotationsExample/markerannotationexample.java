package com.annotationsExample;
class a{
	public void showmydata()
	{
		System.out.println("super class a");
	}
}
class b extends  a{
	@Deprecated
	public void show()
	{
		System.out.println("my show method");
	}
	@Override 
	@SuppressWarnings("unchecked")
	public void showmydata()
	{
		super.showmydata();
		System.out.println("super class b");
	}
		
}

public class markerannotationexample {

	public static void main(String[] args) {
		b x = new b();
		x.showmydata();
		x.show();
	

	}

}
