package com.tasksystem.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.tasksyste.dao.MySQLConnection;


public class MySQLconnectionImpl implements MySQLConnection{
	@Override
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}


}
