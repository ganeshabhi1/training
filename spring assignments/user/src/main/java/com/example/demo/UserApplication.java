package com.example.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		ApplicationContext txt = SpringApplication.run(UserApplication.class, args);
		LoginInterface d = (LoginInterface) txt.getBean("loginImpl");
		boolean flag = false;
		try {
			flag = d.validateUser("ganesh", "abhi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) System.out.println("login Successfully");
		else System.out.println("your username and password not matching");
		AddDetailsInterface m = (AddDetailsInterface) txt.getBean("loginImpl");
		boolean f = false;
		try {
			flag = m.addTask("ganesh", "abhi");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag) System.out.println("inserted Successfully");
		else System.out.println("insertion unsuccessfull");
		
	}

}
