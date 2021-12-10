package com.sonata.Day04;
import java.util.*;

import c.DuplicateEmpoyeeID;
public class UserEmployee extends EmployeeImpl implements Comparable <Employee>{

	public static void main(String[] args) throws DuplicateEmpoyeeID {
		ArrayList <Employee> e1 = new ArrayList <Employee>();
		e1.add(new Employee(1,"ganesh",25000));
		e1.add(new Employee(2,"abhi",35000));
		e1.add(new Employee(3,"ramya", 9000));
		Employee e = new Employee();
		EmployeeImpl i1 = new EmployeeImpl();
		
		System.out.println(e1);
		for(Employee e2:e1) {
			System.out.print(e2.employeeName+" "+e2.employeeId+" ");
			if(e2.employeeSalary<10000) {
				e2.employeeSalary = i1.appSalary(e);
			}
			
			System.out.println(e2.employeeSalary);
			i1.addEmployee(e);
			if(e.compareTo(e2)==0)
			{
				throw new DuplicateEmpoyeeID("your asking for leave out of your limit ");
			}	
		}
	}
}


