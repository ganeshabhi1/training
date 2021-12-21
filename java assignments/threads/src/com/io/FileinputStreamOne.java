package com.io;
import java.io.File;
import java.io.*;


public class FileinputStreamOne {
	public static void main(String[] args) throws IOException {
		//Writing of the file
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\muniganesh.p\\Desktop\\ganesh1.txt");    
        fout.write(65); 
        fout.write(100);
        fout.close();    
        System.out.println("success...");    
        
        //read the same file from the stream.
        File data = new File("C:\\Users\\muniganesh.p\\Desktop\\ganesh1.txt");  
        FileInputStream  file = new FileInputStream(data);  
          
        int k =0;  
        while((k=file.read())!=-1){  
            System.out.println((char)k);  
        }  
        file.close();  
         
        
        
	}

}
