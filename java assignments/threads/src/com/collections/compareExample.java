package com.collections;
import java.util.*;


	public class compareExample {

			public static void main(String[] args) {
				ArrayList<Student> n1 = new ArrayList<>();
				n1.add(new Student(101,"shailaja",35));
				n1.add(new Student(11,"Jayashree",25));
				n1.add(new Student(108,"Roja",18));
			
		    
		 Collections.sort(n1);
		 for(Student s : n1) {
			 System.out.println(s.stdId +  " " + s.stdName + " "+ s.stdAge); }
			}
		   /* Iterator<Student> i1 = n1.iterator();
		    while (i1.hasNext()) {
	    	Student s1 = (Student)i1.next();
		    	System.out.println(s1);
		     }
			}*/	


	}

	
