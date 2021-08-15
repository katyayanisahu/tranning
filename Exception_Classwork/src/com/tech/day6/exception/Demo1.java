package com.tech.day6.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	 public static void main(String[] args)
	    {
		   Scanner sc=new Scanner(System.in);
		   try
		   {   
			    System.out.println("enter two numbers:");
		        int n1=sc.nextInt();
		        System.out.println("n1 "+n1);
		        int n2=sc.nextInt();
		        System.out.println("n2 "+n2);
			    int result=n1/n2;
			    System.out.println("result:"+result);
				   
		   }
		   catch(ArithmeticException ex)
		   {
			   System.out.println("do not give zero");
		   }
		   catch(InputMismatchException ex)
		   {
			   System.out.println(ex);
		   }
		   
	     }
}
