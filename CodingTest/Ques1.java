package com.techment.CodingTest;

import java.util.Scanner;

public class Ques1 {
	
            public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int age[];
			age = new int[5];
			System.out.println("Enter ages of people: ");
			for(int i=0; i<age.length; i++)
			{
				age[i]=sc.nextInt();
			}
			int child=0, adult=0, seniorCitizen=0;
			for(int j=0; j<age.length; j++)
			{
				if(age[j]<18)
					child++;
				else if(age[j]>18 && age[j]<54)
					adult++;
			    else
				    seniorCitizen++;
			}
			System.out.println("children: "+child);
			System.out.println("adult: "+adult);
			System.out.println("senior citizen: "+seniorCitizen);
         }
}
