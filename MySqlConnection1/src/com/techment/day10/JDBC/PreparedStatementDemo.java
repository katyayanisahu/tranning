package com.techment.day10.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
class PreparedStatementDemo {
	public static void main(String[] args) {
	
  try
  {
        Scanner sc=new Scanner(System.in);
        
        //Step-1:load the driver
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   System.out.println("class is found");
	   
	   //step-2:getting the connection
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","katya");
	   System.out.println("connected");
       
	   PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
	   for(int i=0;i<5;i++)
	   {
       System.out.println("Enter id:");
       int x=sc.nextInt();
       
       System.out.println("Enter name:");
       String str=sc.next();
       
       System.out.println("Enter salary:");
       int y=sc.nextInt();
	   }
	    
       //ps.setInt(1,90);
       //ps.setString(2,"rani");
       //ps.setInt(3,34000);
       
       //ps.execute();
       System.out.println("Inserted");
       
  }
  catch(Exception e)
  {
	  e.printStackTrace();
  }
 } 
}	  


