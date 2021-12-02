package com.sonata;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[a.length];
		Scanner s = new Scanner(System.in);
		System.out.println("enter values for array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		
		}
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[a.length-1-i];
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]+" ");
		
		}

	}

}
