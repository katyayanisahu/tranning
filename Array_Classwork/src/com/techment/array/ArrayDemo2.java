package com.techment.array;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) 
	   {
		   int marks[]=new int[3];
		   Scanner scanner=new Scanner(System.in);
		   for(int i=0;i<marks.length;i++)
		   {
			   System.out.println("Enter the "+ i + "marks"); 
			   marks[i]=scanner.nextInt();
		   }
		   for(int i=0;i<marks.length;i++)
		   {
			   System.out.println(marks[i]);
		   }
        }
}	
