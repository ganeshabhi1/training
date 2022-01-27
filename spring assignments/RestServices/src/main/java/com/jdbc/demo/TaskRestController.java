package com.jdbc.demo;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.jdbc.demo.bean.TaskBeen;
import com.jdbc.demo.bean.UserBeen;

@JacksonXmlRootElement

@CrossOrigin("*")
@RestController
public class TaskRestController {
	//adding task
		@Autowired
		TasksSystemDao taskSystemImpl;
		@PostMapping("/restaddtask")
		public ResponseEntity<TaskBeen> addTask(@RequestBody TaskBeen task) throws SQLException {
			taskSystemImpl.addTask(task);
			return new ResponseEntity<TaskBeen>(task,HttpStatus.OK);

		}
		//geting task by task id
		@GetMapping("/restgettask/{taskid}")
		public TaskBeen getTask(@PathVariable int taskid) throws SQLException {
		return taskSystemImpl.getTask(taskid);
		}
		//assign task to owner
		@GetMapping("/updateownerid/{taskid}/{ownerid}")
		public void updateOwnerid(@PathVariable int taskid, @PathVariable int ownerid) {
		taskSystemImpl.assignowner(taskid, ownerid);
		System.out.println("updated successfully");
		}
		//setting priority
			@GetMapping("/setpriority/{taskid}/{priority}")
			public void setpriority(@PathVariable int taskid, @PathVariable String priority) {
			taskSystemImpl.setpriority(taskid, priority);
			System.out.println("updated successfully");
			}
		//setting note 
		@GetMapping("/addnotes/{taskid}/{notes}")
		public void addnote(@PathVariable int taskid, @PathVariable String notes) {
				taskSystemImpl.addnote(taskid, notes);
				System.out.println("updated successfully");
		}
		//getting task based on priority
		@GetMapping("/getTaskByPriority/{priority}")
		public List<TaskBeen> addTask(@PathVariable String priority) throws SQLException {
		
		return   taskSystemImpl.getTaskByPriority(priority);
		}
		//creating user
		@PostMapping("/adduser")
		public ResponseEntity<UserBeen> addUser(@RequestBody UserBeen user) throws SQLException {
		taskSystemImpl.addUser(user);
		return new ResponseEntity<UserBeen>(user,HttpStatus.OK);
		}
		//getting all the tasks
		@GetMapping("/restgetAlltask")
		public List<TaskBeen> getAllTask() throws SQLException {
		   return taskSystemImpl.getAllTask();
		}
		@GetMapping("/restgetAlluser")
		public List<UserBeen> getAllusers() throws SQLException {
		   return taskSystemImpl.getAllusers();
		}

}
