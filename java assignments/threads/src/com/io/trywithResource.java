package com.io;
import java.io.*;

public class trywithResource {
	private static void print() throws IOException{
		 FileInputStream input = new FileInputStream("C:\\Users\\muniganesh.p\\Desktop\\abhi.txt");
		    try(input) {

		        int data = input.read();
		        while(data != -1){
		            System.out.print((char) data);
		            data = input.read();
		        }
		       
		        
		    }
		
	}

	public static void main(String[] args) {
		trywithResource t1 = new trywithResource();
		t1.print();
		

	}

}
