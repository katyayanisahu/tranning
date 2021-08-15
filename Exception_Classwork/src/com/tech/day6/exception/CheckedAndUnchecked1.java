package com.tech.day6.exception;

import java.io.FileNotFoundException;

public class CheckedAndUnchecked1 {
	 public static void main(String[] args) 
	 {
	    try
	    {  
	    	   throw new FileNotFoundException("file is not present");
	  		 
	    }
	    catch(FileNotFoundException e)
	    {   
		    
	    	System.out.println("something went wrong");
	    }
     }
}