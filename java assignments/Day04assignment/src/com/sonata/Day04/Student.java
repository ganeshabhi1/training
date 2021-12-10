package com.sonata.Day04;
import java.util.*;

public class Student {
	public static void main(String args[])
	{
		ArrayList <Studentdetails> stu  = new ArrayList<>();
		stu . add(new Studentdetails(1,"ganesh",68));
		stu . add(new Studentdetails(2,"raju",99));
		stu . add(new Studentdetails(3,"anu",100));
		stu . add(new Studentdetails(4,"vamsi",98));
		Comparator<Studentdetails> comparator = Comparator.comparing(e -> e.marks);
		stu.sort(comparator.reversed());
		for(Studentdetails s : stu) {
			System.out.println(s.id+" "+s.Name+" "+s.marks);
		}
	}
	

}
