package com.sonata;

import java.util.Scanner;

public class testarraycontainsvalue {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("enter values for array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		
		}
		System.out.println("enter a number you wany to search in an array");
		int k = s.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k) {
				System.out.println(k+" is present in array");
				sum++;
				break;
			}
		
		}
		if(sum==0)
		{
			System.out.println(k+" is not present in array");
		}
		



	}

}
