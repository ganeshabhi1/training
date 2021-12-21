package com.io;


	import java.io.File;
    import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class fileio {

		public static void main(String[] args) throws IOException{
			 FileOutputStream fos = new FileOutputStream("C:\\Users\\muniganesh.p\\Desktop\\ganesh.txt");
		      FileInputStream fis = new FileInputStream("C:\\Users\\muniganesh.p\\Desktop\\ganesh.txt");
		      int b =100;
		      int i = 0;
		      char c;
		      try {
		    	  fos.write(b); 
		    	  
		    	  while((i = fis.read())!=-1) {
		    		  c = (char)i;
		    		  System.out.print(c);
		    	  }
		      }
		      finally {
		    	  if(fos!=null)
		              fos.close();
		    	  if(fis!=null)
		              fis.close();
		      }
		      
		}
}


