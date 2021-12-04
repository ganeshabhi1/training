package com.sonata1;

public class mobileproduct extends product{
	void totalprice()
	{
		System.out.println("is an abstract method");
	}

	public static void main(String[] args) {
		mobileproduct m1 = new mobileproduct();
		m1.totalprice();

	}

}
