package com.springmvcexample.demo;

import java.sql.SQLException;

public interface LoginInterface {
	public boolean validateUser(String username, String password) throws SQLException;

}
