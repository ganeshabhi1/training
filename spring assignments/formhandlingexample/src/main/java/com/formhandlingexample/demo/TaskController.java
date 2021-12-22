package com.formhandlingexample.demo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formhandlingexample.demo.impl.TaskSystemImpl;

@Controller
@RequestMapping("/Task")
public class TaskController {
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) {
		Task task =new Task();
		model.addAttribute("TaskModel", task);
		return "taskform";
	}
	@Autowired
	TasksSystemDao taskSystemImpl;
	@RequestMapping(method = RequestMethod.POST)
	public String insertTask(@ModelAttribute ("TaskModel") Task task, BindingResult result) throws SQLException{
	
		boolean f =TaskSystemImpl.addTask(task);
		if(f) {
			String t ="successfully inserted";
			return t;
		}
		else {
			System.out.println("error in insertion");
			return "taskform";
		}
	}

}
