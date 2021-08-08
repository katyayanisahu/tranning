package com.techment.assign1;
import java.util.Scanner;
public class DemoException17 {
	public static void main(String[] args) throws InvalidAgeException
    {
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age of the user:");
	    int age=sc.nextInt();
	    try
	    {
	    	if(age>=18)
	    	{
	    		System.out.println("welcome to vote");
	    	}
	    	else
	    	{
	 			throw new InvalidAgeException("InvalidAgeException");
	    	} 
	 	 }
	     catch(Exception e)
	     {
	 		  System.out.println("Exception occured: " +e);
	 	 }
	 }
}
class InvalidAgeException extends Exception
{
	 	InvalidAgeException(String s){  
	 		  super(s);  
	 	}		  
}  
	
