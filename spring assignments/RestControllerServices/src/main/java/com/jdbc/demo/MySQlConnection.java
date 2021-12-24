package com.jdbc.demo;

import java.sql.Connection;
//creating interface to establish connection
public interface MySQlConnection {
	//creating a method to establish connection
	public Connection getConnection();

}
