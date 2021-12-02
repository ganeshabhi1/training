package com.sonata;

import java.util.Iterator;
import java.util.Scanner;

public class Largest2numbersinarray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a length of array");
		int n=s.nextInt();
		int a[] = new int[n];
		int t=0;
		System.out.println("enter values for array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		
		}
		System.out.println("the 2 greatest numbers in array are "+a[a.length-1]+","+a[a.length-2]);
		

	}

}
