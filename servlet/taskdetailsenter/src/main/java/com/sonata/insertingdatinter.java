package com.sonata;

import java.sql.Date;
import java.sql.SQLException;

public interface insertingdatinter {
	public boolean insert(String taskname,String description,String status,String priority,String notes,String bookmarks,int ownerid,Date createdon,Date modifiedon) throws SQLException;
}