package com.sonata;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class insertingdata implements insertingdatinter {

	@Override
	public boolean insert(String taskname, String description, String status, String priority, String notes,
			String bookmarks, int ownerid, Date createdon, Date modifiedon) throws SQLException {
		// TODO Auto-generated method stub
		boolean st =false;
        try {

            //loading drivers for mysql
            Class.forName("com.mysql.cj.jdbc.Driver");

            //creating connection with the database
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","admin@123");
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into taskde()(taskname,description,status,priority,notes,"
            		+ "bookmarks,ownerid,createdon,modifiedon values(?,?,?,?,?,?,?,?,?)");
            
			
            ps.setString(ownerid, bookmarks)
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;  
	}
	

}
