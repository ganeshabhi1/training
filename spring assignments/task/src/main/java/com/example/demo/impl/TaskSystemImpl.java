package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.stereotype.Component;
import com.example.demo.TaskSystemDao;
import com.example.demo.bean.Task;
@Component
public class TaskSystemImpl implements TaskSystemDao {
	@Autowired
	MySQLConnectionimpl con;
	@Override
	public boolean addTask(Task task) throws SQLException{
		boolean flag = false;
		Connection c = (Connection) con.getConnection();
		String sql = "insert into userde (taskname,description) values(?,?)";
		PreparedStatement st = ((java.sql.Connection) c).prepareStatement(sql);
		st.setString(1, task.getName());
		st.setString(2, task.getDescription());
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}


	


}
