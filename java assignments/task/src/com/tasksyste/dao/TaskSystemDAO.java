package com.tasksyste.dao;
import java.sql.SQLException;

import com.tasksystem.model.task;
public interface TaskSystemDAO {
	public boolean addTask(task task) throws SQLException;

}
