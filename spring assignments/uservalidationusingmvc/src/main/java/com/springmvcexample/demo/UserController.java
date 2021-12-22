package com.springmvcexample.demo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	@Autowired
	LoginInterface loginImpl;
	@RequestMapping("/")
	public String sayHello1(ModelMap map) {
		return "login";
	}
	@RequestMapping("/validate")
	public String sayHello3(Model model,@RequestParam("username") String username,@RequestParam("password") String password) throws SQLException {
		boolean r = loginImpl.validateUser(username,password);
		String s="user name and password not matching";
		if(r)
		{
			return "success";
		}
		else {
			model.addAttribute("msg",s);
			return "login";
		}
	}

}
