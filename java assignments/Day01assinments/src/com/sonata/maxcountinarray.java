package com.sonata;

import java.util.Scanner;

public class maxcountinarray {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("enter values for array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		
		}
		 int maxC = 0;
		 int element=0;
		 for (int i = 0; i <a.length ; i++) {
		 int counter =1;
		 for (int j = i+1; j <a.length ; j++) {
		 if(a[i]==a[j]){
		 counter++;
		 }
		 }
		 if(maxC<counter){
		 maxC=counter;
		 element = a[i];
		 }
		 }
		 System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxC);
		 

	}

}
