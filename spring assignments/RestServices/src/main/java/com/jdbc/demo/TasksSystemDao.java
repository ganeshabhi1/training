package com.jdbc.demo;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.demo.bean.TaskBeen;
import com.jdbc.demo.bean.UserBeen;

public interface TasksSystemDao {
	public boolean addTask(TaskBeen task) throws SQLException;
	public TaskBeen getTask(int taskid)throws SQLException;
	public int assignowner(int taskid , int ownerid);
	public int setpriority(int taskid , String priority);
	public int addnote(int taskid ,String notes);
	public List<TaskBeen> getTaskByPriority(String priority)throws SQLException;
	public boolean addUser(UserBeen user) throws SQLException;
	public List<TaskBeen> getAllTask();
	public List<UserBeen> getAllusers();

}
