package com.formhandlingexample.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.formhandlingexample.demo.MySQlConnection;
import com.formhandlingexample.demo.Task;
import com.formhandlingexample.demo.TasksSystemDao;

public class TaskSystemImpl implements TasksSystemDao {
	@Autowired
	MySQlConnection MySQLConnectionimpl;

	@Override
	public boolean addTask(Task task) throws SQLException {
        boolean flag = false;
		
		Connection c =  MySQLConnectionimpl.getConnection();
		System.out.println(c);
		String sql = "insert into taskde (taskname,description) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, task.getTaskname());
		st.setString(2, task.getDescription());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}

}
