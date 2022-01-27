package com.jdbc.demo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.jdbc.demo.MySQlConnection;
@Component
public class MySQLConnectionimpl implements MySQlConnection {

	@Override
	public Connection getConnection() {
		
			Connection con = null;
			try {
				//geeting the connection of database
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","admin@123");

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//returning the established connection
			return con;
	}

}
