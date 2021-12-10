package com.sonata.Day04;

public class Studentdetails {
	 int id;
     String Name;
     double  marks;
     
    public Studentdetails(int id, String firstName, double marks){
        this.id = id;
        this.Name = firstName;
        this.marks = marks;
    }

	@Override
	public String toString() {
		return "Studentdetails [id=" + id + ", Name=" + Name + ", marks=" + marks + "]";
	}
     
     
    

}
