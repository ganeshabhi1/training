package com.sonata.jdbcexample;
import java.sql.*;

public class Example {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:Mysql://localhost:3306/ganesh","root","admin@123");
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement("select *from ganesh.emp where empid =?");
			ps.setDouble(1,2);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
			}
		}catch (Exception e) {System.out.println(e);}
		

	}

}
