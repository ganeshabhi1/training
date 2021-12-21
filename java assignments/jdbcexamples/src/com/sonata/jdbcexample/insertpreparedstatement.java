package com.sonata.jdbcexample;
import java.sql.*;

public class insertpreparedstatement {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/ganesh","root","admin@123");
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1,2000);
			ps.setString(2,"ganesh");
			ps.setInt(3,300);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}catch (Exception e) {System.out.println(e);}
		

	}

}
