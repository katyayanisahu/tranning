package com.techment.day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDetails {

	public static Connection getConnected() throws Exception {
		Connection con=DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.USERNAME,ConnectionProperty.PASSWORD);
	    System.out.println("successfully connected..");			
		return con;
		
	}

}
