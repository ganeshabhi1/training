package com.jdbc.demo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jdbc.demo.been.TaskBeen;
import com.jdbc.demo.been.UserBeen;

@JacksonXmlRootElement
@RestController
public class TaskRestController {
	//adding task
	@Autowired
	TasksSystemDao taskSystemImpl;
	@GetMapping("/restaddtask")
	public TaskBeen addTaskBeen(TaskBeen task) throws SQLException {
	taskSystemImpl.addTask(task);
	return task;
	}
	//geting task by task id
	@GetMapping("/restgettask/{taskid}")
	public TaskBeen getTask(@PathVariable int taskid) throws SQLException {
	return taskSystemImpl.getTask(taskid);
	}
	//assign task to owner
	@PutMapping("/updateownerid/{taskid}/{ownerid}")
	public void updateOwnerid(@PathVariable int taskid, @PathVariable int ownerid) {
	taskSystemImpl.assignowner(taskid, ownerid);
	System.out.println("updated successfully");
	}
	//setting priority
		@PutMapping("/setpriority/{taskid}/{priority}")
		public void setpriority(@PathVariable int taskid, @PathVariable String priority) {
		taskSystemImpl.setpriority(taskid, priority);
		System.out.println("updated successfully");
		}
	//setting priority
	@PutMapping("/addnotes/{taskid}/{notes}")
	public void addnote(@PathVariable int taskid, @PathVariable String notes) {
			taskSystemImpl.setpriority(taskid, notes);
			System.out.println("updated successfully");
	}
	//getting task based on priority
	@PostMapping("/getTaskByPriority/{priority}")
	public List<TaskBeen> addTask(@PathVariable String priority) throws SQLException {
	
	return   taskSystemImpl.getTaskByPriority(priority);
	}
	//creating user
	@PostMapping("/adduser")
	public ResponseEntity<UserBeen> addUser(@RequestBody UserBeen user) throws SQLException {
		taskSystemImpl.addUser(user);
		return new ResponseEntity<UserBeen>(user,HttpStatus.OK);

	}


}
