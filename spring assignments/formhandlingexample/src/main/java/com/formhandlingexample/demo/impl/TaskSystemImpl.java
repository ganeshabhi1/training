package com.formhandlingexample.demo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formhandlingexample.demo.MySQlConnection;
import com.formhandlingexample.demo.Task;
import com.formhandlingexample.demo.TasksSystemDao;
@Component
public class TaskSystemImpl implements TasksSystemDao {
	@Autowired
	MySQlConnection MySQLConnectionimpl;

	@Override
	public  boolean addTask(Task task) throws SQLException {
        boolean flag = false;
		
		Connection c =  MySQLConnectionimpl.getConnection();
		System.out.println(c);
		String sql = "insert into taskde (taskid,taskname,description,status) values(?,?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setInt(1, task.getTaskid());
		st.setString(2, task.getTaskname());
		st.setString(3, task.getDescription());
		st.setString(4, task.getStatus());
		
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}

}
