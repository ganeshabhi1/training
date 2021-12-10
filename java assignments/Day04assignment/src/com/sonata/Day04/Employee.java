package com.sonata.Day04;

public class Employee  {
	 int employeeId;
	 String employeeName;
	 double employeeSalary;
	 public Employee() {}
	 public Employee(int id ,String name ,double salary) {
		 this.employeeId = id;
		 this.employeeName = name;
		 this.employeeSalary = salary;
		 
	 }
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	public int compareTo(Employee st){  
		   if(employeeId==st.employeeId)  
		     return 0;  
		    else if(employeeId > st.employeeId)  
		      return 1;  
		    else  
		   return -1;  
		  }
	

}
