package com.capgemini.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("dao")
public class GlobalDaoImpl implements GlobalDao{

	@Override
	public void method() {
		try
		{
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test",
				"sa","");
		Statement stmt = con.createStatement();
	      
	      String sql = "CREATE TABLE New " +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

	      stmt.executeUpdate(sql); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
