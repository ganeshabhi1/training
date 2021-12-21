package com.example.demo;

import java.sql.SQLException;

public interface TaskSystemDao {
	public boolean addTask(Task task) throws SQLException;

}
