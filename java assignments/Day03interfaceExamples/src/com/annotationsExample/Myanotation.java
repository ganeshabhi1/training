package com.annotationsExample;
class showone
{
	public void show()
	{
		System.out.println("its my 1st show");
	}
	
}
class showtwo extends showone{
	@Override
	public void show()
	{
		super.show();
		System.out.println("its my 2nd show");
	}
}

public class Myanotation {
	public static void main (String args[]) {
	showtwo s1 = new showtwo();
	s1.show();
	}

}
