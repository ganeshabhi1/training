package com.example.demo.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.AddDetailsInterface;
import com.example.demo.MySQLConnection;


public class AddDetails implements AddDetailsInterface {
	
	@Override
	public boolean addTask(String username, String password) throws SQLException {
		
        boolean flag = false;
        MySQLConnection con = new MySQLConnectionImpl();
		Connection c = (Connection) con.getConnection();
		System.out.println(c);
		String sql = "insert into taskde (taskname,description) values(?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, username);
		st.setString(2, password);
		int r = st.executeUpdate();
		if (r >0)
			return true;
		else 
			return false;
	}

}
