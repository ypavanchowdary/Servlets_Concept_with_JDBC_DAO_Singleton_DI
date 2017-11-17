package com.info.dao;

import com.info.dao.DBCONNECTION;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class EmployeeDAO {
	
	Connection connection;
	
	public EmployeeDAO() {
	
		//Constructor
		connection = DBCONNECTION.createConnection();
	}

	public int addEmployee(int eid, String fname, String lname, String gender, Double sal, int uid, String paswd)
	{
		
		int result=0;
		
		try {
			
			String query = "insert into employee values(?,?,?,?,?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(query);
			pStatement.setInt(1, eid);
			pStatement.setString(2, fname);
			pStatement.setString(3, lname);
			pStatement.setString(4, gender);
			pStatement.setDouble(5, sal);
			pStatement.setInt(6, uid);
			pStatement.setString(7, paswd);
								
			result = pStatement.executeUpdate();
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
					          }
		
		
		return result;
		
		
		
		
		
	}
	

}
