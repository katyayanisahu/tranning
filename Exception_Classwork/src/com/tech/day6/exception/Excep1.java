package com.tech.day6.exception;

public class Excep1 {
  public static void main(String[] args) {
	System.out.println("name is katya");
	System.out.println("email katya.sahu");
	try
	{
		System.out.println(1/0);  
    }
	catch(ArithmeticException e)
	{
		System.out.println("dont give zero");
	}
	System.out.println("contact 7415724196");
  }
}
