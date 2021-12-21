package com.example.demo;
import com.example.demo.been.Task;
import java.sql.SQLException;

public interface TasksSystemDao {
	public boolean addTask(Task task) throws SQLException;

}
