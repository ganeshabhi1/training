package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.bean.Task;
import com.example.demo.impl.TaskSystemImpl;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		ApplicationContext txt = SpringApplication.run(TaskApplication.class, args);
		TaskSystemDao d = (TaskSystemDao) txt.getBean("taskSystemImpl");
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
			flag = new TaskSystemImpl().addTask(t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) System.out.println("Sucess");
		else System.out.println("Not able to insert the task");
		
	}

}
