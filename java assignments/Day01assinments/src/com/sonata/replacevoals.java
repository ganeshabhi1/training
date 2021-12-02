package com.sonata;
import java.util.*;

public class replacevoals {

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("enter a string");
	    String s = sc.nextLine();
	    char ch[]=s.toCharArray();
	    
	    for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
               {
                ch[i]='$';
               }   
        }
	    for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
	    

	}

}
