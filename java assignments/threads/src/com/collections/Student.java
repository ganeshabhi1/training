package com.collections;
import java.util.*;

public class Student implements Comparable<Student> {
	int stdId;
	  String stdName;
	  int stdAge;
	  
	public Student(int stdId, String stdName, int stdAge) {
		
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}

	@Override
	public int compareTo(Student s) {
		if(stdId==s.stdId)
		{
			return 0;
		}
		else if(stdId >s.stdId){
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
