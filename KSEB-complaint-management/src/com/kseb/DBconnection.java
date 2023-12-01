package com.kseb;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	final String driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:33066/servletproject";
	final String user = "root";
	final String password = "admin";
	Connection conn=null;

	public Connection getConnection(){
		try{
			
		
	 Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
	}catch(Exception e){
		e.printStackTrace();
	}
		return conn;
	}
}
