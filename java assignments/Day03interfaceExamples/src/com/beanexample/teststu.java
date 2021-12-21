package com.beanexample;

public class teststu {

	public static void main(String[] args) {
		adress a1 = new adress();
		a1.setCity("nellore");
		a1.setState("ap");
		a1.setPin(123);
		student s1 = new student();
		s1.setStuId(122);
		s1.setStuname("ganesh");
		s1.setMarks(24.45);
		s1.setObj(a1);
		System.out.println((s1.getMarks()));
		System.out.println((s1.getObj()));
		System.out.println((s1.getStuId()));
		System.out.println((s1.getStuname()));
		
		System.out.println(s1);
		

	}

}
