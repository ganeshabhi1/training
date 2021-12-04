package com.sonata1;

class Student extends person {
	public Student()
	{
		
		System.out.println("Student: constructor is called");
	}
	public Student(String name, String school, double grade) {
		 super(name); 
		 this.school = school;
		 this.grade = grade;
		 System.out.println("Student: constructor 2 is called");
		 }
}
public class demo{

	public static void main(String[] args) {
		Student s = new Student("ganesh","aprs",10.0); 
		Student s1 = new Student();
		

	}
}

