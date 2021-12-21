package com.example.demo.imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.LoginInterface;
import com.example.demo.MySQLConnection;

@Component
public class LoginImpl implements LoginInterface {
	@Autowired
	MySQLConnection mySQLConnectionImpl;
	

	@Override
	public boolean validateUser(String username, String password) throws SQLException {
		boolean st =false;
        try {
        	
        	Connection c =  mySQLConnectionImpl.getConnection();
        	System.out.println(c);
    		String sql = "select password from userlogin where username=? ";

    		PreparedStatement ps = c.prepareStatement(sql);
            
            
			
            ps.setString(1, username);
      
            ResultSet rs =(ResultSet) ps.executeQuery();
            st = rs.next();
            if( rs.getString("password").equals(password))
    			    {
    			    return true;
    			    }else
    			    {
    			    return false;
    			    }
    		
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
	}

}
