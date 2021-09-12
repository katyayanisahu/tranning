package com.techment.TrainTicket;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionPropertyDao {
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/trainapplication?autoReconnect=true&useSSL=false";
	public static final String USERNAME="root";
	public static final String PASSWORD="katya";
	
	static{
	
	try{
		
	Class.forName(ConnectionPropertyDao.DRIVER_NAME);
	System.out.println("class is found");
	
	Connection con = DriverManager.getConnection(ConnectionPropertyDao.URL,ConnectionPropertyDao.USERNAME,ConnectionPropertyDao.PASSWORD);
	System.out.println("conected");
	
	Statement stmt=con.createStatement();
	stmt.execute("insert into trainDetail values( 'Banglore Express' , 10104,'chennai','Banglore',1000)");
	System.out.println("inserted");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	}

}

