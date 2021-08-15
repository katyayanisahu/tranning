package com.techment.day10.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MySqlConnection {
	public static void main(String[] args) {
		//A o=new A();
		try
		{
		   //Step-1:load the driver
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   System.out.println("class is found");
		   
		   //step-2:getting the connection
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","katya");
		   System.out.println("connected");
		   
		   //step-3:
		   Statement stmt=con.createStatement( );
		   stmt.execute("insert into employee values(3,'katya',3400);");
		   
		   
		   
		   //DELETE  from employee where name="katya";
		   
		   stmt.execute("insert into employee values(4,'gitika',3400);");
		   System.out.println("inserted");
		   
		   ResultSet rs=stmt.executeQuery("select * from employee");
		   System.out.println(); 
		   while(rs.next())
		   {
			   System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
		   }
		   
		   
	    }
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 }	
}
