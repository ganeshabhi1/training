package com.example.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.TasksSystemDao;
import com.example.demo.been.Task;
import com.example.demo.MySQlConnection;
@Component
public class TaskSystemImpl implements TasksSystemDao {
	@Autowired
	MySQlConnection con;
	@Override
	public boolean addTask(Task task) throws SQLException {
		boolean flag = false;
		
		Connection c = (Connection) con.getConnection();
		System.out.println(c);
		String sql = "insert into taskde (taskname,description) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, task.getName());
		st.setString(2, task.getDescription());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}

}
