package com.techment.CodingTest;

import java.util.Scanner;

public class Ques1 {
         public static void main(String[] args) {
			int age[]= {34,78,56,12,67,20,50};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the person age:");
			int person_age=sc.nextInt();
			if(person_age<18)
			{
				System.out.println("children");
			}
			else if(person_age>=18)
			{
				System.out.println("adult");
			}
			else
			{
				System.out.println("senior citizen");
			}
         }	
}
