package com.tasksys;
import java.sql.Connection;
import java.sql.SQLException;


import com.tasksystem.dao.impl.TaskSystemDAOImpl;
import com.tasksystem.model.task;

public class TestMyTaskSystem {

	public static void main(String[] args) {
		//MySQLConnection con = new MySQLConnectionImpl();
				//Connection c = con.getConnection();
				//System.out.println(c);
				task t =  new task();
				t.setTaskId(1000);
				t.setName("Create a DAO");
				t.setOwnerId(5000);
				t.setDescription("Create a class for Task");
				try {
					new TaskSystemDAOImpl().addTask(t);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		

	}

}
