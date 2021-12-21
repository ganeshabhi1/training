package com.collections;
import java.util.*;

public class MycollectinExample {

	public static void main(String[] args) {
		ArrayList<Comparable> a1 = new ArrayList<Comparable>();
		a1.add("ganesh");
		a1.add("abhinaya");
		a1.add("rakesh");
		a1.add("ramya");
		int a =10;
		a1.add(a);
		System.out.println(a1);
		for(Object name : a1)
		{
			System.out.println(name);
		}
		

	}

}
