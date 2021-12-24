package com.jdbc.demo.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdbc.demo.MySQlConnection;
import com.jdbc.demo.TasksSystemDao;
import com.jdbc.demo.been.TaskBeen;
import com.jdbc.demo.been.UserBeen;
@Component
public class TaskSystemImpl implements TasksSystemDao {
	//establishing connection through auto wired
	@Autowired
	MySQlConnection mySQLConnectionimpl;
	@Override
	//adding task
	public boolean addTask(TaskBeen task) throws SQLException {
boolean flag = false;
		//establishing connetion
		Connection c =  mySQLConnectionimpl.getConnection();
		System.out.println(c);
		//preparing sql statement to insert values into database
		String sql = "insert into taskde (taskid,taskname,description,status,priority,notes,bookmarks,ownerid) values(?,?,?,?,?,?,?,?)";
		PreparedStatement st = c.prepareStatement(sql);
		//inserting values to database
		st.setInt(1, task.getTaskid());
		st.setString(2, task.getTaskname());
		st.setString(3, task.getDescription());
		st.setString(4, task.getStatus());
		st.setString(5, task.getPriority());
		st.setString(6, task.getNotes());
		st.setString(7, task.getBookmarks());
		st.setInt(8, task.getOwnerid());
		
		int r = st.executeUpdate();
		//checking wether it is inserted or not
		if (r >0)
			return true;
		else 
			return false;
	}
	//selecting task by task id
	@Override
	public TaskBeen getTask(int taskid) throws SQLException {
					//establishing connetion
					TaskBeen task = new TaskBeen();
					Connection c =  mySQLConnectionimpl.getConnection();
					try {
						//preparing sql statement to insert values into database
						String sql = "select *from taskde where taskid=?";
						PreparedStatement st = c.prepareStatement(sql);
						//inserting values to database
						st.setInt(1, taskid);
						ResultSet rs =st.executeQuery();
						while(rs.next()) {
							task.setTaskid(rs.getInt("taskid"));
							task.setTaskname(rs.getString("taskname"));
							task.setDescription(rs.getString("description"));
							task.setStatus(rs.getString("status"));
							task.setPriority(rs.getString("priority"));
							task.setNotes(rs.getString("notes"));
							task.setBookmarks(rs.getString("bookmarks"));
							task.setOwnerid(rs.getInt("ownerid"));
					     }
						c.close();
					}
					catch(SQLException e) {
						System.out.println(e.getMessage());
					}
					return task;
			
		}
	//assign task to owner
	@Override
	public int assignowner(int taskid, int ownerid) {
		//establishing connetion
		TaskBeen task = new TaskBeen();
		Connection c =  mySQLConnectionimpl.getConnection();
		int rows =0;
		try {
			//preparing sql statement to insert values into database
			String sql = "update taskde set ownerid=? where taskid=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setInt(2, taskid);
			st.setInt(1, ownerid);
			rows = st.executeUpdate();
			c.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
	}
	//setting priority
	@Override
	public int setpriority(int taskid, String priority) {
		//establishing connetion
				TaskBeen task = new TaskBeen();
				Connection c =  mySQLConnectionimpl.getConnection();
				int rows =0;
				try {
					//preparing sql statement to insert values into database
					String sql = "update taskde set priority=? where taskid=?";
					PreparedStatement st = c.prepareStatement(sql);
					st.setInt(2, taskid);
					st.setString(1, priority);
					rows = st.executeUpdate();
					c.close();
				}
				catch(SQLException e) {
					System.out.println(e.getMessage());
				}
				return rows;
		
	}
	//adding notes
	@Override
	public int addnote(int taskid, String notes) {
		//establishing connetion
		TaskBeen task = new TaskBeen();
		Connection c =  mySQLConnectionimpl.getConnection();
		int rows =0;
		try {
			//preparing sql statement to insert values into database
			String sql = "update taskde set note=? where taskid=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setInt(2, taskid);
			st.setString(1, notes);
			rows = st.executeUpdate();
			c.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;

		
	}
	//getting task based on priority.
	@Override
	public List<TaskBeen> getTaskByPriority(String priority) throws SQLException {
		Connection c =  mySQLConnectionimpl.getConnection();
		List<TaskBeen> tasklist= new ArrayList<TaskBeen>();
		try {
			//preparing sql statement to insert values into database
			
			String sql = "select *from taskde where priority=?";
			PreparedStatement st = c.prepareStatement(sql);
			//inserting values to database
			st.setString(1, priority);
			ResultSet rs =st.executeQuery();
			while(rs.next()) {
				TaskBeen task1 = new TaskBeen();
				task1.setTaskid(rs.getInt("taskid"));
				task1.setTaskname(rs.getString("taskname"));
				task1.setDescription(rs.getString("description"));
				task1.setStatus(rs.getString("status"));
				task1.setPriority(rs.getString("priority"));
				task1.setNotes(rs.getString("notes"));
				task1.setBookmarks(rs.getString("bookmarks"));
				task1.setOwnerid(rs.getInt("ownerid"));
				tasklist.add(task1);
		     }
			c.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return tasklist;
	}
	@Override
	public boolean addUser(UserBeen user) throws SQLException {
		Connection con = mySQLConnectionimpl.getConnection();

		String sql = "insert into userdetails (userid ,username ,description ,ownerid ,creatorid ,createdon ,modifiedon) values(?,?,?,?,?,?,?)";
		PreparedStatement st;

		st = con.prepareStatement(sql);

		st.setInt(1, user.getUserid());
		st.setString(2, user.getUsername());
		st.setString(3, user.getDescription());
		st.setInt(4, user.getOwnerid());
		st.setInt(5, user.getCreaterid());
		st.setDate(6, user.getCreatedon());
		st.setDate(7, user.getModifiedon());

		int r = st.executeUpdate();

		if (r > 0) {
			System.out.println(r);
			return true;
		} else
			return false;
	}
	}




