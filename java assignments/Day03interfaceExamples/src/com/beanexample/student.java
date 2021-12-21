package com.beanexample;

public class student {
	private int stuId;
	private String stuname;
	private double marks;
	adress obj;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public adress getObj() {
		return obj;
	}
	public void setObj(adress obj) {
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "student [stuId=" + stuId + ", stuname=" + stuname + ", marks=" + marks + ", obj=" + obj + "]";
	}
	

}
