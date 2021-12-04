package com.sonata.day02assignment;
class stu
{
	int stdid;
	String stdname;
	String stdclass;
	stu(int a ,String b,String c){
		this.stdid = a;
		this.stdname = b;
		this.stdclass = c;
	}
	public void display() {
		System.out.println(stdid);
		System.out.println(stdname);
		System.out.println(stdclass);
	}
}

public class Student {

	public static void main(String[] args) {
	    stu s1 = new stu(10,"ganesh","abc");
	    stu s2 = new stu(20,"abhi","def");
	    s1.display();
	    s2.display();

	}

}
