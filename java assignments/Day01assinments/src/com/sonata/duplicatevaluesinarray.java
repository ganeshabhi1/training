package com.sonata;

import java.util.Scanner;

public class duplicatevaluesinarray {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		int sum =0;
		System.out.println("enter values for array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" is duplicate number");
					sum++;
				}
			}
		
		}
		if(sum==0)
		{
			System.out.println("there is no duplicate number in array");
		}
		

	}

}
