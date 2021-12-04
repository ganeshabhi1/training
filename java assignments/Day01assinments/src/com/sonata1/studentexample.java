package com.sonata1;
class stu
{
	private int stuid ;
	private String stuname ;
	private int stumarks ;
	
	public stu(int stuid , String stuname , int stumarks) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.stumarks = stumarks;
	}
	public void display()
	{
		System.out.println(stuid);
		System.out.println(stuname);
		System.out.println(stumarks);
	}
}

public class studentexample {

	public static void main(String[] args) {
		stu s1 = new stu(10,"abhi",101);
		stu s2 = new stu(20,"ganesh",101);
		s1.display();
		s2.display();
	}

}
