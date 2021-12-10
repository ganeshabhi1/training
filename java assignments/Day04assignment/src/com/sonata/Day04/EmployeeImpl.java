package com.sonata.Day04;

public class EmployeeImpl extends Employee implements EmployeeInt {
	@Override
	public void addEmployee(Employee e) {
		System.out.println("employee add successfully");
	}

	@Override
	public void deleteEmployee(Employee e) {
		System.out.println("employee deleted successfully");
		
	}

	@Override
	public double yearSalary(Employee e1) {
		double d = e1.employeeSalary*12;
		return d;
	}

	@Override
	public double appSalary(Employee e1) {
		double salary = e1.employeeSalary+5000;
		return salary;
	}
	
	

}
