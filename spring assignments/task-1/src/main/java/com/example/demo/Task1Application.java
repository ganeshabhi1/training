package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.been.Task;
import com.example.demo.impl.TaskSystemImpl;

@SpringBootApplication
public class Task1Application {

	public static void main(String[] args) {
		ApplicationContext txt = SpringApplication.run(Task1Application.class, args);
		TasksSystemDao d = (TasksSystemDao) txt.getBean("taskSystemImpl");
		boolean flag = false;
		Task t= new Task();
		t.setName("ganesh");
		t.setDescription("on going");
		t.setStatus("in process");
		t.setPriority("high");
		t.setNotes("important");
		t.setIsBookmarked("isbookmark");
		t.setOwnerId(4);
		try {
			flag = d.addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) System.out.println("Sucess");
		else System.out.println("Not able to insert the task");
		
	}

}
