package com.formhandlingexample.demo;

import java.sql.SQLException;
public interface TasksSystemDao {
	public boolean addTask(Task task) throws SQLException;

}
