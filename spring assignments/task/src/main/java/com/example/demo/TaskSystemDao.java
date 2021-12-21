package com.example.demo;

import java.sql.SQLException;

import com.example.demo.bean.Task;

public interface TaskSystemDao {
	

	public boolean addTask(Task task) throws SQLException;

}
