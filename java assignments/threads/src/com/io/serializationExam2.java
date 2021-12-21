package com.io;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;

	public class serializationExam2 {

		public static void main(String[] args)throws IOException {
			
			serializationExample obj =new serializationExample(123, "ganesh","nellore");
			ObjectOutputStream oos =null;
			FileOutputStream fos=null;
			serializationExample ob =null;
			//Serialized the object and created a file with that.
			 try {
			 fos = new FileOutputStream("C:\\Users\\muniganesh.p\\Desktop\\abhi.txt"); 
			 
			 oos = new ObjectOutputStream(fos);
		      oos.writeObject(obj);
		      
			 }
			 finally {
		    	 oos.close();
		    	 fos.close();
		     }
		    
		      
		      System.out.println("Serialzation Done!!");
		     
			//Deserialized the employee object
		      FileInputStream fis = new FileInputStream("C:\\Users\\muniganesh.p\\Desktop\\abhi.txt");
		      ObjectInputStream ois = new ObjectInputStream(fis);
		      try {
		      ob = (serializationExample)ois.readObject();
		      ois.close();
		      fis.close();
		      }catch(ClassNotFoundException s) {System.out.println(s);}
		      System.out.println("Employee ID is " + ob.getEmpId());
		      System.out.println("Employee Add is" + ob.getEmpAdd());
		}

}
